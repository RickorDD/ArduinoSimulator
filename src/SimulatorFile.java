import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SimulatorFile {

    public static void main(String[] args) {
	FileWriter fw;
	try {
	    fw = new FileWriter(new File("C:\\copy\\analog.txt"));
	    fw.write("2");
	    fw.write(" ");
	    fw.write("1");
	    fw.write(System.lineSeparator());
	    fw.write("3");
	    fw.write(" ");
	    fw.write("0");
	    fw.close();
	} catch (IOException ex) {
	    ex.printStackTrace();
	}
    }
}
