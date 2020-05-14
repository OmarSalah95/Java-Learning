package src;

import java.util.Scanner;

public class ByteShort {
    public static void main(String[] args) {
        System.out.println("Enter name: ");
        // User input
        Scanner scannerTest = new Scanner(System.in);
        // Read the next line, capture it as a string called name
        String name = scannerTest.nextLine();
        System.out.println("Your name is : " + name);
        // Release the memory
        scannerTest.close();
}
}
