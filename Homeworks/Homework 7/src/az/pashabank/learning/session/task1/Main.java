package az.pashabank.learning.session.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       addStringsEnteredFromKeyboard();
    }

    public static void addStringsEnteredFromKeyboard() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        int n = scanner.nextInt();

        scanner.nextLine();
        for (int i = 0; i < n; i++){
            list.add(scanner.nextLine());
        }

        System.out.println(list);
    }
}
