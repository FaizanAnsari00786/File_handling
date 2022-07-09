package file_handling;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Handling_assign2 {
	public void readdatain_range(int initial,int end) throws IOException {
		File f=new File("../file_handling/src/file_handling/new.txt.txt");
		FileReader re=new FileReader(f);
		BufferedReader br=new BufferedReader(re);
		
		
		
		int faiz=0;
		String s;
		while((s=br.readLine())!=null) {
			faiz=faiz+1;
			if((faiz>=initial)&&(faiz<=end)) {
				System.out.println(s);
			}
			
		}
	}

	

	public static void main(String[] args) throws IOException {
		
		Handling_assign2 ob=new Handling_assign2 ();
		ob.readdatain_range(2,6);
	}
	

}
