package day6;
import java.util.*;
public class sortarray {
public static void main(String[] args) {
List<String> list_Strings = new ArrayList<String>();
list_Strings.add("aaa");
list_Strings.add("brd");
list_Strings.add("gu");
list_Strings.add("ehy");
list_Strings.add("xzs");
System.out.println("List before sort: "+list_Strings);
Collections.sort(list_Strings);
System.out.println("List after sort: "+list_Strings);    
}
}
