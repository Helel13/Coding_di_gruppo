package it.develhope.code;

import java.util.Scanner;

public class Start {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter you name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Please insert your age: ");
        int age = scanner.nextInt();
        boolean isValid = false;

        /*

        do {
            System.out.println("Please insert a number as age");
        } while ();

        do {
            System.out.println("It's required an age above 18's years old to proceed: ");
        } while (age < 18);*/

        /*
        boolean isValid = false;
        int age = 0;
        while (!isValid) {
            System.out.print("Please insert your age: ");

            try {
                age = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Please insert a number as age");
                scanner.next();
            }

            if (age < 18) {
                System.out.println("It's required an age above 18's years old to proceed: ");
            } else {
                isValid = true;
            }
        }*/

            scanner.nextLine();
            System.out.println("Have you already turned old? Y/N?");
            String turnedOld = scanner.nextLine();

            User user = new User(name, surname, age);

            user.printUser();
            scanner.close();

            if (turnedOld.equalsIgnoreCase("y")) {
                CalcolateAge.calculateAge(user.age);
            } else if (turnedOld.equalsIgnoreCase("n")) {
                CalcolateAge.calculateAge(user.age + 1);
            } else {
                System.out.println("Restart script");
            }

    }
}

