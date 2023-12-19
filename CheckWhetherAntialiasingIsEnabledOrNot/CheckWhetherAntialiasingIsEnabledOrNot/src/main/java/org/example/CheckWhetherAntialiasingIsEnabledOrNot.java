package org.example;

import java.applet.*;
import java.awt.*;
import java.awt.RenderingHints;
public class CheckWhetherAntialiasingIsEnabledOrNot extends Applet {
    Label text;
    //Create the label
    public void init()
    {
        setBackground(Color.white);
        setLayout(null);
        text = new Label();
        text.setBounds(100,150,150,100);
        this.add(text);
    }
    //Function to check if antialiasing is enabled or not
    public void paint(Graphics g)
    {
        Graphics2D G = (Graphics2D)g;
        RenderingHints rh = G.getRenderingHints();
        if(rh.containsValue(RenderingHints.VALUE_ANTIALIAS_ON))
            text.setText("Antialiasing is Enabled");
        else
            text.setText("Antialiasing is Disabled");
    }
}