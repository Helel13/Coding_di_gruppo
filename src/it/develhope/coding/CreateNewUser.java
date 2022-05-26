package it.develhope.coding;

import java.time.LocalDate;
import java.util.Scanner;

public class CreateNewUser{


    private CreateNewUser() {}

    public static void newUser() {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = inputUser.nextLine();

        System.out.print("Please enter your surname: ");
        String surname = inputUser.nextLine();


        boolean isValid = false;
        do {

            System.out.print("please enter your age: ");

            if (inputUser.hasNextInt()) {
                int age = inputUser.nextInt();

                if (age<0||age> LocalDate.now().getYear()){
                    System.out.println("age is invalid");
                    isValid = true;
                }else {
                    isValid = false;
                    inputUser.nextLine();

                    boolean isValidTurnedOld;
                    do {
                        System.out.print("Are you turned old? Y/N: ");
                        String turnedOld = inputUser.nextLine();

                        if (!(turnedOld.equalsIgnoreCase("y") || turnedOld.equalsIgnoreCase("n"))) {
                            System.out.println("Please insert only Y or N");
                            isValidTurnedOld = true;

                        } else {
                            int bornYear = CalculateAge.calculateAge(age);
                            User user;
                            if (turnedOld.equalsIgnoreCase("y")) {
                                user = new User(name, surname, age, bornYear);

                            } else {
                                user = new User(name, surname, age, bornYear - 1);

                            }
                            UserList.userList.add(user);
                            isValidTurnedOld = false;
                        }
                    } while (isValidTurnedOld);
                }

            }else {
                System.out.println("age non valid");
                inputUser.next();
                isValid = true;

            }

        }while (isValid);



    }
}




