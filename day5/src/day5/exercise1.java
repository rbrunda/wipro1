package day5;
import java.io.File;
public class exercise1 {
	public static void main(String args[]) {
		File file=new File("C:\\Program Files");
		String[] filelist=file.list();
		for(String name:filelist) {
			System.out.println(name);
		}
		
	}

}