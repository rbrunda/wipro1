package day5;
public class property {
	public static void main(String args[]) {
		String userhome=System.getProperty("user.home");
		String javaversion=System.getProperty("java.version");
		String javahome=System.getProperty("java.home");
		String classpath=System.getProperty("class.path");
		String osname=System.getProperty("os.name");
		String username=System.getProperty("user.name");
		String userdir=System.getProperty("user.dir");
		System.out.println(userhome);
		System.out.println(javaversion);
		System.out.println(javahome);
		System.out.println(classpath);
		System.out.println(osname);
		System.out.println(username);
		System.out.println(userdir);	
	}
}