package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CloseTheFrameUsingWindowAdapterClass {

    static JFrame frame;
    //Driver function
    public static void main(String args[])
    {
        //Create a frame
        frame=new JFrame("Window Adapter Class");
        frame.setBackground(Color.white);
        frame.setSize(500,500);
        //Create an object of the class
        CloseTheFrameUsingWindowAdapterClass obj=new CloseTheFrameUsingWindowAdapterClass();
        //Associate WindowListener with frame
        frame.addWindowListener((WindowListener) obj);
        frame.setVisible(true);
    }
    //function to display status as closing when the frame is closed
    @Override
    public void CloseTheFrameUsingWindowAdapterClass(WindowEvent e)
    {
        System.out.println("Status of frame : Closing");
        windowClosed(e);
    }
    //function to close the frame
    @Override
    public void CloseTheFrameUsingWindowAdapterClass(WindowEvent e)
    {
        frame.dispose();
    }
    //function to display status as iconified when the frame is minimized
    @Override
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Status of frame : Iconified");
    }
    //function to display status as deiconified when the frame is maximized
    @Override
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Status of frame : Deiconfied");
    }
    //function to display status as activated when the frame is active
    @Override
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Status of frame : Activated");
    }
    //function to display status as deactivated when the frame is inactive
    @Override
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Status of frame : Deactivated");
    }
    //function to display status as opened when the frame is created
    @Override
    public void windowOpened(WindowEvent e)
    {
        System.out.println("Status of frame : Opened");
    }
}
