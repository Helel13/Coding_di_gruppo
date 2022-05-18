package it.develhope.coding;

import java.time.LocalDate;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your surname: ");
        String surname = scanner.nextLine();


        boolean isValid = false;
        int age = 0;
        while (!isValid) {
            System.out.println("Please enter your age in integer: ");

            try {
                age = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("the age need to be a integer");

                scanner.next();
            }

            if (age < 0 || age > LocalDate.now().getYear()) {
                System.out.println("the age is not valid");
            } else {
                isValid = true;
            }
       }



        scanner.nextLine();
        System.out.println("Have you already turned old? Y/N");
        String turnedOld = scanner.nextLine();

        User user = new User(name, surname, age);
        user.printUser();
        scanner.close();

        if (turnedOld.equalsIgnoreCase("y")) {
            CalculateAge.calculateAge(user.age);
        } else if (turnedOld.equalsIgnoreCase("n")) {
            CalculateAge.calculateAge(user.age + 1);
        } else {
            System.out.println("restart script");
        }


    }

}
