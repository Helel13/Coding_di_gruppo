package it.develhope.coding;

import java.time.LocalDate;

public class CalculateAge {


    private CalculateAge() {}

    public static void calculateAge(int userAge) {

        int bornYear = (LocalDate.now().getYear() - userAge);
        System.out.println("The User in born in : " + bornYear);

    }






}
