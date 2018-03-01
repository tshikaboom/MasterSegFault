package hashcode;
import java.io.*;

public class WriteFile {
    public static BufferedWriter openFile(String file) throws IOException {
	return new BufferedWriter(new FileWriter(file));
    }

    public static void writeLine(BufferedWriter bw, String line) throws IOException {
	bw.write(line);
    }

    public static void main(String[] args) {
	BufferedWriter bw = null;

	try {
	    bw = WriteFile.openFile(args[0]);

	    WriteFile.writeLine(bw, "TEST TEST TEST\nTOTOTOOT");
	    bw.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
