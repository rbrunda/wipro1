package day7;
import java.util.*;
import java.util.stream.Collectors;
public class counteven{
	public static void main(String []args) {
		List<Integer> s1 = new ArrayList<Integer>();
		s1.add(4);
		s1.add(2);
		s1.add(8);
		s1.add(3);
		long c =s1.stream().filter(x -> x % 2==0).count();
		System.out.println(c);
	}
}