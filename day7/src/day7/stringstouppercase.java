package day7;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class stringstouppercase{
	public static void main(String []args) {
		List<String> s1 = new ArrayList<String>();
		s1.add("apple");
		s1.add("wipro");
		s1.add("cat");
		s1.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}
}