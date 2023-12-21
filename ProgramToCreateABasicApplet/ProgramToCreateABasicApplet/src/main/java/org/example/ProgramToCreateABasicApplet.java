package org.example;

import java.applet.*;
import java.awt.*;

import static javax.swing.text.StyleConstants.setBackground;

public sealed class ProgramToCreateABasicApplet extends Applet permits ProgramToCreateABasicAppletImpl {
    //Function to initialize the applet
    public void init()
    {
        setBackground(Color.white);
        setLayout(new FlowLayout(FlowLayout.CENTER));
    }



    //Function to draw the string
    public void paint(Graphics g)
    {
        g.drawString("Hello World",100,200);
    }
}