package day6;
import java.util.*;
public class reversearray{
public static void main(String[] args) {
List<String> list_Strings = new ArrayList<String>();
list_Strings.add("purple");
list_Strings.add("blue");
list_Strings.add("Orange");
list_Strings.add("grey");
list_Strings.add("pink");
System.out.println("List before reversing :\n" + list_Strings);  
Collections.reverse(list_Strings);
System.out.println("List after reversing :\n" + list_Strings); 
}
}
