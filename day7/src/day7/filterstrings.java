package day7;
import java.util.*;
import java.util.stream.Collectors;
public class filterstrings{
	public static void main(String []args) {
		List<String> s1 = new ArrayList<String>();
		s1.add("apple");
		s1.add("books");
		s1.add("pen");
		s1.add("admin");
		List<String> li = s1.stream()
				.filter(s -> s.contains("a"))
				.collect(Collectors.toList());
		System.out.println(li);
	}
}