package day5;
import java.io.File;
public class readwrite {
	public static void main(String[] args) {
		File my_file_dir = new File("C:\\\\Users\\\\aaal\\\\Downloads\\\\OneDrive\\\\Desktop\\\\pdf\\\\ai2.docx");
        if (my_file_dir.canWrite()) 
          {
           System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
          } 
        else
         {
           System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
         }
        if (my_file_dir.canRead()) 
          {
           System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
          } 
        else
         {
        	 System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
         }  
     }
}