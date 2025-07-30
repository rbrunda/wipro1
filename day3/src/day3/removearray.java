package day3;
import java.util.Arrays;  
public class removearray { 
public static void main(String[] args) { 
   int[] my_array = {20, 11, 57, 65, 16, 56, 77, 18, 29, 49}; 
   System.out.println("Original Array : "+Arrays.toString(my_array));      
   int removeIndex =6; 
   for(int i = removeIndex; i < my_array.length -1; i++){ 
        my_array[i] = my_array[i + 1]; 
      } 
    System.out.println("After removing the second element: "+Arrays.toString(my_array)); 
 } 
 } 