package hashcode;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.lang.Math;

public class ShortestDistance {
	public String ret = "";
	public int row;
	public int col;
	public int f;
	
	public String compute(int row, int col, int cars, int rides, int bonus, int steps) {
		 String res = new String();

		 Set<Integer> done = new HashSet<>();
		 
		 for (int i = 0; i < f; ++i) {
			 res += "" + nb_ride_per_car;
			 int ride;
			 
			 for (int j = 0; j < nb_ride_per_car; ++j) {
				 do {
					 ride = r.nextInt(n);
				 } while(done.contains(ride));
			 
				 res += " " + ride;
				 done.add(ride);
			 }
			 res += "\n";
		 }
		 
		 return res;
	}

	// Calculates distance between (curr_x, curr_y) et (dst_x, dst_y)
	public int distanceTo(curr_x, curr_y, dst_x, dst_y) {
		return Math.abs(curr_x - dst_x) + Math.abs(curr_y - dst_y)
	}

	// (x, y) coordinates of the car
	// k number of lines to take from file
	public void dispatchCar(x, y, k) {
		String line = "";

		ret += line;

	}
}
