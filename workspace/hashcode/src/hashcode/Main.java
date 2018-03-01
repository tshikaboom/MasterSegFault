package hashcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

import hashcode.Radom;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader bf = ReadFile.openFile(args[0]);
			BufferedWriter bw = WriteFile.openFile(args[0].substring(0, args[0].length()-3) + ".out3");

			int col, row, f, n, b, t;
			String ln = bf.readLine();
			String[] utils = ln.split(" ");
			col = Integer.parseInt(utils[0]);
			row = Integer.parseInt(utils[1]);
			f = Integer.parseInt(utils[2]);
			n = Integer.parseInt(utils[3]);
			Ride[] rides = new Ride[n];
			String line = "";
			int i = 0;
			while((line = bf.readLine()) != null) {
				rides[i] = new Ride(line);
				i++;
			}
			//hashcode.Radom solution = new Radom();
			//String res = solution.compute(col, row, f, n);
			
			//Modulo modulo = new Modulo();
			//String res = modulo.compute(col, row, f, n);
			
//			hashcode.Radom solution = new Radom();
			ShortestDistance sd = new ShortestDistance();
//			String res = solution.compute(col, row, f, n);

            // Eat it line by line
			String res = sd.compute(ln);
			System.out.println(res);
			
			WriteFile.writeLine(bw, res);
			bw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
