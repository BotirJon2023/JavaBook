package org.example;

import java.applet.*;
import java.awt.*;
public class CreateATransparentCursor  extends Applet {
    //Function to create a transparent cursor


    public void init()
    {
        setBackground(Color.white);
        setLayout(null);
        //Create a transparent cursor
        Toolkit t = Toolkit.getDefaultToolkit();
        Image img = t.getImage("");
        Point p = new Point(0,0);
        Cursor c = t.createCustomCursor(img,p,"my_cursor");
        //Create a area when the cursor is transparent
        TextArea area = new TextArea();
        area.setBackground(Color.green);
        area.setBounds(100,100,300,300);
        this.add(area);
        //Set transparent cursor to the area
        area.setCursor(c);
    }
}