package day6;
import java.util.ArrayList;
import java.util.Collections;
  public class cleararray {
  public static void main(String[] args) {
          ArrayList<String> c1= new ArrayList<String>();
          c1.add("grey");
          c1.add("red");
          c1.add("blue");
          c1.add("White");
          c1.add("yellow");
          System.out.println("Original array list: " + c1);
          c1.removeAll(c1);
          System.out.println("Array list after remove all elements "+c1);   
   }
}
