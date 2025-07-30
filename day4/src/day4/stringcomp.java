package day4;
public class stringcomp {
    public static void main(String[] args) {
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Stephen Edwin King";

        boolean equals1 = columnist1.equals(columnist2);
        boolean equals2 = columnist1.equals(columnist3);
        boolean equals3 = columnist2.equals(columnist3);

        System.out.println("\"" + columnist1 + "\" equals \"" + columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals \"" + columnist3 + "\"? " + equals2);
        System.out.println("\"" + columnist2 + "\" equals \"" + columnist3 + "\"? " + equals3);
    }
}