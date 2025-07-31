package day6;
import java.util.*;
  public class retriveindexele {
  public static void main(String[] args) {
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("pink");
  list_Strings.add("blue");
  list_Strings.add("black");
  list_Strings.add("green");
  list_Strings.add("red");
  System.out.println(list_Strings);
  String element = list_Strings.get(1);
  System.out.println("second element: "+element);
  element = list_Strings.get(4);
  System.out.println("fourth element: "+element);
 }
}
