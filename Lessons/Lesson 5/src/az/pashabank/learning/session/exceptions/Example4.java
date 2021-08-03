package az.pashabank.learning.session.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example4 {

    public static void main(String[] args) throws IOException {

        String fileName = "/D:/Git Hub/PASHA Bank/PASHA-Bank-Learning-Session/Lessons/Lesson 5/test.txt";

        File file = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(file);

        System.out.println("\n Content of the file is as follows: \n");

        int ch;
        while ((ch = fileInputStream.read()) != -1) {
            System.out.print((char) ch);
        }

        fileInputStream.close();

        System.out.println("\nBye bye!");
    }
}
