package hashcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.sun.org.apache.xpath.internal.SourceTree;
import hashcode.Radom;

public class TurnByTurn {

    private String results = "";

    public TurnByTurn(int nb_cars, int time, Set<Ride> undone) {

        int timeMax = time;
        int i = 0;
        Course[] tab_courses = new Course[nb_cars];

        for (i =0; i< nb_cars; i++) {
            tab_courses[i] = new Course(0, 0, 0, 0, 0);
            tab_courses[i].x = 0;
            tab_courses[i].y = 0;
            tab_courses[i].time_remaining = 0;
            tab_courses[i].nb_assigned = 0;
            tab_courses[i].id_courant = 0;

        }


        String s;
        while (time-- > 0 || !undone.isEmpty()) {
            for (Ride r : undone)
            {
                r.laxite = r.deadline - time - (Math.abs(r.to_x - r.from_x)+ Math.abs(r.to_y - r.from_y));
            }
            for (Course c : tab_courses ) {
                if(c.time_remaining == 0){
                    Ride lui = null;
                    int lax = timeMax;
                    Iterator iter = undone.iterator();
                    while (iter.hasNext()) {
                        Ride r = (Ride) iter.next();
                        if (r.laxite < lax){
                            lax = r.laxite;
                            lui = r;
                        }
                    }
                    c.time_remaining = (Math.abs(lui.to_x - lui.from_x)+ Math.abs(lui.to_y - lui.from_y))
                            + Math.abs(lui.from_x - c.x) + Math.abs(lui.from_y - c.y);
                    c.x = lui.to_x;
                    c.y = lui.to_y;
                    c.nb_assigned++;
                    c.ids.add(lui.id);
                    undone.remove(lui);
                }else{
                    c.time_remaining--;
                }
            }


    }
        for (Course c : tab_courses) {
            s = c.ids.size() + " ";
            for (Integer id : c.ids) {
                s += id + " ";
            }
            s += '\n';
            results += s;
        }

        System.out.println(results);
    }


}