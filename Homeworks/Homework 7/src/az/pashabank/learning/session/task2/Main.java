package az.pashabank.learning.session.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<Integer, User> map = new HashMap<>();

        map.put(1, new User(1, "Nijat Dursunlu", "nicat.dursunlu@gmail.com", "qweerty123"));
        map.put(2, new User(2, "Kanan Huseynli", "kanan.huseynli@gmail.com", "vrebhthy"));
        map.put(3, new User(3, "Elgun Jumayev", "elgun.jumayev@gmail.com", "fw4ef3grmnfew"));


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Select option \n 1. Login \n 2. Password");
//
//        int menu = scanner.nextInt();
//
//        scanner = new Scanner(System.in);
//        if(menu == 1) {
//            System.out.println("Please, type login:");
//            String login = scanner.next();
//
//            System.out.println("Please, type password:");
//            String password = scanner.next();
//
//            boolean valueExists = map.containsValue(new User("nicat.dursunlu@gmail.com", "qweerty123"));
//            if (valueExists) {
//                System.out.println(map);
//            }
//        }

//        System.out.println(map.get(2));
        boolean valueExists = map.containsValue(new User("nicat.dursunlu@gmail.com", "qweerty123"));
        System.out.println(valueExists);
    }
}
