package org.example;

public class SeparateTheIndividualCharactersFromAString {

    public static void main(String[] args) {
        String string = "Oh, now, now, now. This is what we're going to do, is that when we go out, we're going to buy you two new presents! How's that, pumpkin?\n" +
                "[Outside the house morning. The happy family is heading to the car. Echoing from the book, Harry was meant to be staying with his babysitter Mrs. Figg. While Dudley's parents took him and a friend --from Dudley's school-- out for the day --on his birthday-- either to amusement parks, hamburger restaurants for lunch or dinner, or the movies, Harry was meant to be staying with Mrs. Figg. Mrs. Figg was a mean old lady who lived two streets away. But since she broke her leg, the Dursleys were forced to take Harry to the zoo. That is because there was no one else to replace Mrs. Figg. Not even Aunt Marge --Uncle Vernon's sister-- nor Aunt Petunia's friend Yvonne. Yvonne --Aunt Petunia's friend-- was on vacation in Majorca. In the meantime, the viewers now see the house morning. And the family is heading to the car.]";

        System.out.println("Individual characters from given string: ");

        for(int i = 0; i < string.length(); i++){
            System.out.print(string.charAt(i) + " ");
        }
    }

}
