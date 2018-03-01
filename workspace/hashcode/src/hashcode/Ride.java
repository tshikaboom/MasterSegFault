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

    public distance(Ride r) {
        int curr_x = r.from_x;
        int dst_x = r.from_y
        return Math.abs(curr_x - dst_x) + Math.abs(curr_y - dst_y)
    }

    // Calculates distance between (curr_x, curr_y) et (dst_x, dst_y)
    public int distanceTo(curr_x, curr_y, dst_x, dst_y) {
        return Math.abs(curr_x - dst_x) + Math.abs(curr_y - dst_y)
    }
}