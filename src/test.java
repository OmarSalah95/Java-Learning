package src;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("system start");
        System.out.println("Enter an integer");
        Scanner userInputScanner = new Scanner(System.in);
        long sum = 0;
        long count = 0;
        long avg = 0;
        // boolean isAnInt = userInputScanner.hasNextInt();

        while (userInputScanner.hasNextInt()) {

            // variable used to capture input
            long userInput = userInputScanner.nextLong();
            sum += userInput;
            count++;
            avg = sum / count;
            // System.out.println("SUM = " + sum + " AVG = " + avg);
            userInputScanner.nextLine();

        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        userInputScanner.close();

    }

}