package org.example;

import java.util.Scanner;

public class SimpleChatbotSimulation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userInput;

        System.out.println("Hello! I'm your chatbot. Type 'exit' to end the chat.");

        while (true) {

            System.out.print("You: ");

            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {

                System.out.println("Goodbye!");

                break;

            } else {

                System.out.println("Chatbot: I hear you say, '" + userInput + "'!");
            }
        }

        scanner.close();
    }
}