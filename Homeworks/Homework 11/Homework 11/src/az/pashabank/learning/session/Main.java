package az.pashabank.learning.session;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

    public static String FirstReverse(String str) {
        // code goes here
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse +=  str.charAt(i);
        }
        return reverse;
    }

    // Her bir service ucun ferqli mapper yazmaliyiq?
    // Crud and Jpa
    // native auery and jpql
    // studentDto and StudentEntity
    // StudentMapper her entity ucun ferqli mapper yazilmalidir

}
