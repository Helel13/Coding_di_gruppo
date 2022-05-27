package it.develhope.coding;

import java.util.Scanner;

public class Menu {

    private Menu(){};

    public synchronized static void startMenu(){

        Scanner menuInput = new Scanner(System.in);

        System.out.println("Welcome");





        do {
            System.out.println("press: [N] to create new user ");
            System.out.println("       [L] to print the List of user");
            System.out.println("       [X] to close");
            System.out.print("Select: ");
            String answer = menuInput.nextLine();

            if (!(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("l") ||
                    answer.equalsIgnoreCase("x"))){
                System.out.println("The choice is invalid");

            }else {
                if (answer.equalsIgnoreCase("n")){
                    CreateNewUser.newUser();

                }else if (answer.equalsIgnoreCase("l")) {
                    UserList.userList.forEach(User::printUser);

                }else {
                    System.out.println("GoodBye");
                    break;
                }
            }



        }while (true);


    }



}
