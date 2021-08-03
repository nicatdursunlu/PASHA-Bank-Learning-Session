package az.pashabank.learning.session.exceptions.example4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Step1 {

    public static void main(String[] args) {

        String fileName = "/D:/Git Hub/PASHA Bank/PASHA-Bank-Learning-Session/Lessons/Lesson 5/test.txt";

        File file = new File(fileName);
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            System.out.println("\n Content of the file is as follows: \n");

            int ch;
            while ((ch = fileInputStream.read()) != -1) {
                System.out.print((char) ch);
            }

            fileInputStream.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found exception " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("Input output exception " + ioe.getMessage());
        }

        System.out.println("\nBye bye!");
    }
}
