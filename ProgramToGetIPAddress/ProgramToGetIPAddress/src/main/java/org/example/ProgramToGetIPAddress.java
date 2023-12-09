package org.example;

import java.net.InetAddress;

public class ProgramToGetIPAddress {

    public static void main(String args[]) throws Exception {
        InetAddress IP = InetAddress.getLocalHost();

        System.out.println("IP of my system is := " + IP.getHostAddress());
    }
}

