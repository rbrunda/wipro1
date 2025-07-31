package day6;
import java.util.*;
  public class searchele {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("aaa");
  list_Strings.add("bbb");
  list_Strings.add("ccc");
  list_Strings.add("ddd");
  list_Strings.add("eee");
    if (list_Strings.contains("aaa")) {
    System.out.println("Found the element");
    } else {
    System.out.println("There is no such element");
    }
 }
}
