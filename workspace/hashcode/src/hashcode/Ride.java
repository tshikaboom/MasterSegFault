// ride from [0, 0] to [1, 3], earliest start 2, latest finish 9

public class Ride {
    public int
            from_x,
            from_y,
            to_x,
            to_y,
            start,
            deadline,
            laxite;
    public static int id;


    public Ride(String line){
        String[] tokens = line.split(" ");
        this.from_x = tokens[0];
        this.from_y = tokens[1];
        this.to_x = tokens[2];
        this.to_y = tokens[3];
        this.start = tokens[4];
        this.deadline = tokens[5];
        this.id = id+=;
        this.laxite = 0;
    }

    // Distance between two rides
    public distance(Ride r) {
        int curr_x = r.from_x;
        int curr_y = r.from_y;
        int dst_x = r.to_x;
        int dst_y = r.to_y;
        return Math.abs(curr_x - dst_x) + Math.abs(curr_y - dst_y)
    }
}