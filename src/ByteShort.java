package src;

import java.util.Scanner;

public class ByteShort {
    public static void main(String[] args) {
        
        // User input
        Scanner scannerTest = new Scanner(System.in);
        
        
        System.out.println("Enter DOB: ");
        long age = scannerTest.nextLong();
        age = 2020-age;
        scannerTest.nextLine();

        System.out.println("Enter name: ");
        // Read the next line, capture it as a string called name
        String name = scannerTest.nextLine();

        System.out.println("enter a number");
        int randomasdf = scannerTest.nextInt();
        scannerTest.nextLine();
        
        // Must ALWAYS include nextLine after taking in a number!!

        System.out.println("Enter another name: ");
        // Read the next line, capture it as a string called name
        String secondname = scannerTest.nextLine();

        

        System.out.println("Your name is : " + name);
        System.out.println("Your age is: " + age);
        System.out.println("number" + randomasdf);
        System.out.println("second" + secondname);
        // Release the memory
        scannerTest.close();

    }
}
