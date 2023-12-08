package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num, reverse = 0, rem, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = s.nextInt();
        if (isPalindrome(num, reverse) == num)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is not a Palindrome");
    }

    static int isPalindrome(int num, int rev) {
        if (num == 0)
            return rev;
        int rem = num % 10;
        rev = rev * 10 + rem;
        return isPalindrome(num / 10, rev);
    }
}
