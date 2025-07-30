package day5;
import java.io.File;
import java.io.FilenameFilter;
public class exercise {
	public static void main(String args[]) {
		File file=new File("C:\\Users\\aaal\\Downloads\\OneDrive\\Desktop\\pdf");
		String[] list=file.list(new FilenameFilter(){
			public boolean accept(File dir,String name) {
				if(name.toLowerCase().endsWith(".py")){
					return true;
				}
				else {
					return false;
				}
			}
		});
		for(String f:list) {
			System.out.println(f);
		}
	}
}