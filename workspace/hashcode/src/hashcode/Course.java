package hashcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


import hashcode.Radom;

public class Course {
    public int x;
    public int y;
    public int time_remaining;
    public int nb_assigned;
    public int id_courant;
    public ArrayList<Integer> ids;

    public Course(int x, int y, int time_remaining, int assigned, int courant) {
        this.x = x;
        this.y = y;
        this.time_remaining = time_remaining;
        this.nb_assigned = assigned;
        this.id_courant = courant;
        ids = new ArrayList<>();
    }

}