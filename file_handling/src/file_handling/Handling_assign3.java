package file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Handling_assign3 {
	public void writedata(int initial,int end) throws IOException {
	File f=new File("../file_handling/src/file_handling/new2.txt.txt");
	FileWriter fw=new FileWriter(f)	;
	BufferedWriter bw=new BufferedWriter(fw);
	Scanner Sc=new Scanner(System.in);
	String data;
	System.out.println("enter the data");
	int rowcount=0;
	for(int i=1;i<=end;i++) {
		if((i>=initial)&&(i<=end)) {
			
		
		data=Sc.next();
		BufferedWriter =new bw.Write(data);
		BufferedWriter bw.newLine();}
		else {
			BufferedWriter bw.newLine();
		}
		
	}
		
		
	}
		
	
	

	public static void main(String[] args) throws IOException {
	
		Handling_assign3 ob=new Handling_assign3();
		ob. writedata(3,7);
	}

}
