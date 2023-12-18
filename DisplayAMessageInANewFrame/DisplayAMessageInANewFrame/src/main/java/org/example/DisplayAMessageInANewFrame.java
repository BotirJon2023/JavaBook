package org.example;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class DisplayAMessageInANewFrame implements ActionListener {

    public static void main(String args[])
    {
        //Create a frame
        JFrame frame = new JFrame("Original Frame");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create an object
        DisplayAMessageInANewFrame obj = new DisplayAMessageInANewFrame();

        //Create a button to view message
        JButton button = new JButton("View Message");
        frame.add(button);
        button.addActionListener(obj);

        //View the frame
        frame.setVisible(true);
    }
    //Function to create a new frame with message
    public void actionPerformed(ActionEvent e)
    {
        //Create a new frame
        JFrame sub_frame = new JFrame("Sub Frame");
        sub_frame.setSize(200,200);

        //Display the message
        JLabel label = new JLabel("!!! Hello !!!");
        sub_frame.add(label);

        //View the new frame
        sub_frame.setVisible(true);
    }
}
