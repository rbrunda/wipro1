package day6;
import java.util.*;
public class shufflearray{
public static void main(String[] args) {
List<String> list_Strings = new ArrayList<String>();
list_Strings.add("pink");
list_Strings.add("white");
list_Strings.add("green");
list_Strings.add("red");
list_Strings.add("Blue");
System.out.println("List before shuffling:\n" + list_Strings);  
Collections.shuffle(list_Strings);
System.out.println("List after shuffling:\n" + list_Strings); 
}
}
