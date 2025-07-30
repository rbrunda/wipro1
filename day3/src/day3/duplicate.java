package day3; 
public class duplicate { 
 public static void main(String[] args)  
    { 
        int[] my_array = {5, 2, 5, 9, 6, 6, 7, 2}; 
        for (int i = 0; i < my_array.length-1; i++) { 
            for (int j = i+1; j < my_array.length; j++) { 
                if ((my_array[i] == my_array[j])) { 
                    System.out.println("Duplicate Element : "+my_array[j]); 
                } 
            } 
        } 
    }     
}