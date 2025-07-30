package day5;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class filetest {
	public static void main(String args[]) {
		try {
			File file=new File("chandu.txt");
			if(file.createNewFile()) {
				System.out.println("File is created");
			}
			else {
				System.out.println("File already exists"+" "+file.getAbsolutePath());
			}
			FileWriter writer=new FileWriter(file);
			writer.write("Hi JAVA");
			writer.close();
			FileReader reader=new FileReader(file);
			int c;
			while((c=reader.read())!=-1) {
				char ch=(char)c;
				System.out.print(ch);
			}
		}
		catch(IOException e) {
			System.out.println("Exception");
			}
		}
	}