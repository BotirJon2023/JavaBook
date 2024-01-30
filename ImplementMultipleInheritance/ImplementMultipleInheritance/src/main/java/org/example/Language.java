package org.example;

public class Language extends Frontend implements Backend {

    String language = "Java";


    public void connectServer() {
        System.out.println(language + " can be used as backend language.");
    }

    public static void main(String[] args) {

        Language java = new Language();

        java.connectServer();

        java.responsive(java.language);
    }
}

