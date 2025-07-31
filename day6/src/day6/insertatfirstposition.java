package day6;
import java.util.*;
  public class insertatfirstposition {
  public static void main(String[] args) {
  List<String> list = new ArrayList<String>();
  list.add("brown");
  list.add("blue");
  list.add("Orange");
  list.add("White");
  list.add("Black");
  System.out.println(list);
  list.add(1, "Pink");
  list.add(6, "Yellow");
  System.out.println(list);
 }
}
