package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Handling_4 {
	public void copypaste() throws IOException {
		FileInputStream r=new 	FileInputStream("../file_handling/src/file_handling/new.txt.txt");
		FileOutputStream w=new 	FileOutputStream("../file_handling/src/file_handling/new2.txt.txt");
		int i;
		while((i=r.read())!=-1) {
			w.write((char)i);
		}
		System.out.println("data copied successfully");
	}

	public static void main(String[] arg) throws IOException
	{
		Handling_4 ob=new Handling_4();
		ob.copypaste();

	}

}
