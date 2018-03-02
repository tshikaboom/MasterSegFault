package hashcode;

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
        this.from_x = Integer.parseInt(tokens[0]);
        this.from_y = Integer.parseInt(tokens[1]);
        this.to_x = Integer.parseInt(tokens[2]);
        this.to_y = Integer.parseInt(tokens[3]);
        this.start = Integer.parseInt(tokens[4]);
        this.deadline = Integer.parseInt(tokens[5]);
        this.id = id++;
        this.laxite = 0;
    }

    // Distance between two rides
    public int distance(Ride r) {
        int curr_x = r.from_x;
        int curr_y = r.from_y;
        int dst_x = r.to_x;
        int dst_y = r.to_y;
        return Math.abs(curr_x - dst_x) + Math.abs(curr_y - dst_y);
    }

    public String compute(String ln) {
        return "";
    }

    public String toString() {
        return "";
    }
}