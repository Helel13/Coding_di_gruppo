package it.develhope.coding;

import java.util.Scanner;

public class Menu {

    private Menu(){};

    public static void startMenu(){

        Scanner menuInput = new Scanner(System.in);

        System.out.println("Welcome");




        boolean menuValidation;
        do {
            System.out.println("press: [N] to create new user ");
            System.out.println("       [L] to print the List of user");
            System.out.println("       [X] to close");
            System.out.print("Select: ");
            String answer = menuInput.nextLine();

            if (!(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("l") ||
                    answer.equalsIgnoreCase("x"))){
                System.out.println("The choice is invalid");
                menuValidation = true;
            }else {
                if (answer.equalsIgnoreCase("n")){
                    CreateNewUser.newUser();
                    menuValidation = true;
                }else if (answer.equalsIgnoreCase("l")) {
                    UserList.userList.forEach(User::printUser);
                    menuValidation = true;
                }else {
                    System.out.println("GoodBye");
                    break;
                }
            }



        }while (menuValidation);


    }



}
