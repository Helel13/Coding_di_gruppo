package it.develhope.code;

import java.time.LocalDate;

public class CalcolateAge{

    private CalcolateAge(){}

    static LocalDate today = LocalDate.now();

    static int yearToday = today.getYear();

    public static void calculateAge(int userAge){
        int bornYear = (yearToday - userAge);
        System.out.println("L'utente è nato nel: " + bornYear);
    }



}
