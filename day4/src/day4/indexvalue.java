package day4;
public class indexvalue {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = str.indexOf(ch);
            System.out.println("Index of '" + ch + "' = " + index);
        }
    }
}