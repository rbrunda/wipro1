package day5;
import java.io.File;
public class checkpath {
	public static void main(String[] args) {
        File my_file_dir = new File("C:\\Users\\aaal\\Downloads\\OneDrive\\Desktop\\pdf");
         if (my_file_dir.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
       }
  }