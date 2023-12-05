package org.example;

public class Nested_For_Loop {

    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 2; i++) // outer loop for rows
        {
            for (int j = 1; j <= 5; j++) // inner loop for columns
            {
                System.out.print(count + " "); // print the count variable
                count++;
            }
            System.out.println();
        }
    }
}