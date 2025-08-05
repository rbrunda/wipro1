package day7;
import java.util.*;
import java.util.stream.Collectors;
public class maximumno{
	public static void main(String []args) {
		List<Integer> s1 = new ArrayList<Integer>();
		s1.add(4);
		s1.add(7);
		s1.add(2);
		s1.add(3);
		int m=s1.stream().max((x,y)->x>y?1:-1).get();
		System.out.println(m);
	}
}