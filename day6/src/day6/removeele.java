package day6;
import java.util.*;
  public class removeele {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("grey");
  list_Strings.add("blue");
  list_Strings.add("White");
  list_Strings.add("yellow");
  System.out.println(list_Strings);
  list_Strings.remove(3);
  System.out.println("After removing third element from the list:\n"+list_Strings);
 }
}
