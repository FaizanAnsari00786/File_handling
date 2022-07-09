package file_handling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_handling1 {
	public void m1() throws IOException {
	File f=new File("../file_handling/src/file_handling/a.txt.txt");
	FileReader re= new FileReader(f);
	BufferedReader br=new BufferedReader(re);
	String s;
	while((s=br.readLine())!=null) {
		System.out.println(s);
	}
	
	
	
	}

	private FileWriter FileWriter(File f) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) throws IOException
	{
		File_handling1 re=new File_handling1();
		re.m1();
		}
}