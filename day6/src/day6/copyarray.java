package day6;
import java.util.*;
public class copyarray {
public static void main(String[] args) {
List<String> L1 = new ArrayList<String>();
L1.add("a");
L1.add("b");
L1.add("c");
L1.add("d");
System.out.println("L1: " + L1);
List<String> L2 = new ArrayList<String>();
L2.add("A");
L2.add("B");
L2.add("C");
L2.add("D");
System.out.println("L2: " + L2);
Collections.copy(L1, L2);
System.out.println("Copy List to List2,\nAfter copy:");
System.out.println("L1: " + L1);
System.out.println("L2: " + L2);
}
}
