package day7;
import java.util.*;
import java.util.stream.Collectors;
public class sumofnum{
	public static void main(String []args) {
		List<Integer> s1 = new ArrayList<Integer>();
		s1.add(4);
		s1.add(7);
		s1.add(2);
		s1.add(3);
		int sum=s1.stream().reduce(0, Integer::sum);
		System.out.println(sum);
	}
}