package file_handling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Handlig_file {

	public static void main(String[] args) throws IOException {
		File f=new File("../file_handling/src/file_handling/hello.txt.txt");
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter b=new BufferedWriter(fw);
		b.newLine();
		b.write("my name");
		b.newLine();//for moving cursor tp the next line
		b.write("okkey keep going");
		b.close();//for closeing and saving the file
		
	}

}
