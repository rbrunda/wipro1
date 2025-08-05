package day7;
import java.util.*;
import java.util.stream.Collectors;
public class filterprint{
	public static void main(String []args) {
		List<Integer> s1 = new ArrayList<Integer>();
		s1.add(4);
		s1.add(7);
		s1.add(2);
		s1.add(3);
		s1.stream()
				.filter(x->x%2==0)
				.forEach(x -> System.out.print(x+" "));
	}
}