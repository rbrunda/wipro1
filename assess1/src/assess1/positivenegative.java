package assess1;
public class positivenegative{
	public static void main(String args[]) {
		int number;
		number=Integer.parseInt(args[0]);
		if(number<0) System.out.println("negative");
		else if(number==0) System.out.println("zero");
		else System.out.println("positive");
		}
	} 