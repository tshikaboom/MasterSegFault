package hashcode;
import java.io.*;

public class ReadFile {
	public static BufferedReader openFile(String file) throws FileNotFoundException {
		return new BufferedReader(new FileReader(file));
	}

	public static String readLine(BufferedReader br) throws IOException {
		return br.readLine();
	}


	public static void main(String[] args) {
		BufferedReader bf = null;
		try {
			bf = ReadFile.openFile(args[0]);

			String line;

			while( (line = ReadFile.readLine(bf)) != null) {
				System.out.println("red: " + line);
			}
		} catch (IOException  e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
