package day7;
import java.util.*;
import java.util.stream.Collectors;
public class filternegative{
	public static void main(String []args) {
		List<Integer> s1 = new ArrayList<Integer>();
		s1.add(-4);
		s1.add(7);
		s1.add(-2);
		s1.add(3);
		List<Integer> li = s1.stream()
				.filter(x->x<0)
				.collect(Collectors.toList());
		System.out.println("original list:"+s1);
		System.out.println("filtered list:"+li);
	}
}