package day3;
import java.util.Arrays;  
public class mergedigits { 
public static void main(String[] args) { 
   int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   int[] arr2= {11,27,31,46,50};
   int[] arr=new int[arr1.length+arr2.length];
   for (int i=0;i<arr1.length;i++) {
	   arr[i]=arr1[i];
   }
   for(int i=0 ; i<arr2.length; i++)
   {
	   arr[arr1.length+i]=arr2[i];
   }
   System.out.println("merged Array: "+Arrays.toString(arr));
   for (int i = 0; i < arr.length - 1; i++) {
       for (int j = 0; j < arr.length - i - 1; j++) {
           if (arr[j] > arr[j + 1]) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
           }
       }
   }
   System.out.println("ascending order");
   for(int i = 0; i < arr.length; i++) {
       System.out.print(arr[i] + " ");
   }
   System.out.println();
   System.out.println("descending order:");
   for(int i=arr.length-1;i>=0;i--) {
	   System.out.print(arr[i] + " ");
   }
}
}