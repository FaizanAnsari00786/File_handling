package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Handling_assign {
public void readdata(int line) throws IOException {
	File f=new File("../file_handling/src/file_handling/match.txt.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	int faiz = 0;
	
	
	String s;
	while((s=br.readLine())!=null) {
		faiz=faiz+1;
		if(faiz==line)
		{
			System.out.print(s);
			break;
		}
	}
}
	public static void main(String[] args) throws Exception  {
		 Handling_assign ob=new  Handling_assign ();
		 ob.readdata(3);
	 
	}

}
