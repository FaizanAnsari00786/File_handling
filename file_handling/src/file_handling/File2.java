package file_handling;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;

public class File2 {

	public static void main(String[] args) throws IOException {
		File f=new File("../file_handling/src/file_handling/match.txt.txt");
		FileReader re=new FileReader(f);
		BufferedReader br=new BufferedReader(re);
		String s ;
		while((s=br.readLine())!=null) {
			System.out.println(s);
			 
		}
		
	}

}
