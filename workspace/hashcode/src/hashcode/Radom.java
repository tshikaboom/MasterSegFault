package hashcode;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Radom {
	public int row;
	public int col;
	public int f;
	
	public String compute(int col, int row, int f, int n) {
		 String res = new String();
		 int nb_ride_per_car = n/f;
		 Random r = new Random();
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
}
