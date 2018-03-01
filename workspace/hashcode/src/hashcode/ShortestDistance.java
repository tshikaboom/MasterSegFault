package hashcode;

import java.util.*;
import java.lang.Math;


/**
 * Every time a ride finishes, pick K random elements from the assignedRides list
 * and from that list pick the closest pickup point
 */

public class ShortestDistance {
    public String ret = "";
    public int row;
    public int col;
    public int f;
    public HashSet<Ride> rides;
    public HashMap<Integer, SortedSet<Ride>> assignedRides;
    public int cars;


    public ShortestDistance(HashSet<Ride> rs, int k) {
        this.rides = rs;
        compute(k);
    }

    /**
     * Takes the latest element in destList, extracts the coordinates
     * and takes 'k' random elements from the destinationList
     * picks the closest one to latest position and appends it
     *
     * @param k How many assignedRides to check on the list
     * @return String with output
     */
    public String compute(int k) {
        Random r = new Random();
        int i = 0;
        // Pick the closest available ride
        while (!rides.isEmpty()) {
            int ride_index = r.nextInt(rides.size());
            int car = i % cars;

            // Next destination calc //
            // Grab latest dest
            assignedRides.get(car);


            rides.remove(car);
            i++;
        }

        // Build output string
        for (Integer s : assignedRides.keySet()) {
            ret += assignedRides.get(s) + "\n";
        }
        return ret;

    }

    /**
     * Find shortest next target for @param car
     * from @param k random destination
     *
     * @param car Destination from
     * @param k   Number of randoms on list
     */
    public void nextDest(int car, int k) {

    }

    // Calculates distance between (curr_x, curr_y) et (dst_x, dst_y)
    public int distanceTo(int curr_x, int curr_y, int dst_x, int dst_y) {
        return Math.abs(curr_x - dst_x) + Math.abs(curr_y - dst_y);
    }


}
