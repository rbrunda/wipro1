package day6;
import java.util.*;
  public class updatearray {
  public static void main(String[] args) {
  List<String> Strings = new ArrayList<String>();
  Strings.add("pink");
  Strings.add("Green");
  Strings.add("brown");
  Strings.add("White");
  Strings.add("Blue");
  System.out.println(Strings);
  Strings.set(2, "red");
  System.out.println(Strings);
 }
}