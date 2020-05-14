package src;

import java.util.Scanner;

public class ByteShort {
    public static void main(String[] args) {
        
        // User input
        Scanner scannerTest = new Scanner(System.in);
        System.out.println("Enter name: ");
        // Read the next line, capture it as a string called name
        String name = scannerTest.nextLine();

        System.out.println("Enter DOB: ");
        long age = scannerTest.nextLong();
        age = 2020-age;

        System.out.println("Your name is : " + name);
        System.out.println("Your age is: " + age);
        // Release the memory
        scannerTest.close();

    }
}
