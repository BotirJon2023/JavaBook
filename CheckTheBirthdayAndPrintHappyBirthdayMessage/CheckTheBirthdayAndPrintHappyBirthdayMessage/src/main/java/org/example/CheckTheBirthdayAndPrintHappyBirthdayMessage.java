package org.example;

import java.time.LocalDate;
import java.time.Month;

public class CheckTheBirthdayAndPrintHappyBirthdayMessage {

    public static void main(String args[]) {


        int birthDate = 23;
        Month birthMonth = Month.SEPTEMBER;

        LocalDate currentDate = LocalDate.now();
        System.out.println("Todays Date: " + currentDate);

        int date = currentDate.getDayOfMonth();
        Month month = currentDate.getMonth();

        if (date == birthDate && month == birthMonth) {
            System.out.println("HAPPY BIRTHDAY TO YOU !!");
        } else {
            System.out.println("Today is not my birthday.");
        }
    }
}
