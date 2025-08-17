package assess1;
import java.util.Scanner;
public class primeornot {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		sc.close();
		int j=0;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0) j=1;
		}
		if(j==0) System.out.println("prime");
		else System.out.println("not prime");
		}
}