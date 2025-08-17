package assess1;
public class prime{
	public static void main(String args[]) {
		for(int i=10;i<=99;i++)
		{
			int f=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					f=1;break;
				}
			}
			if(f==0) System.out.println(i);
			}
		}
	} 