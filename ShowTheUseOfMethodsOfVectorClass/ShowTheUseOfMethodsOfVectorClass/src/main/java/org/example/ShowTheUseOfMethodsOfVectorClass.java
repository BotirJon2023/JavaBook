package org.example;


import java.util.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ShowTheUseOfMethodsOfVectorClass extends Applet implements ActionListener {
    TextField num;
    Label list, out;
    Vector<Integer> vec;

    //Function to initialize the applet
    public void init() {
        setBackground(Color.white);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //Create a vector
        vec = new Vector<>();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
    }

    //Function to set the features for applet
    public void start() {
        //Display the vector list
        list = new Label();
        list.setText("Vector List : " + vec);
        this.add(list);
        //Create a text field for number input
        num = new TextField(10);
        this.add(num);
        //Display the method options
        Button add = new Button("Add");
        Button del = new Button("Delete");
        Button search = new Button("Search");
        Button cap = new Button("Capacity");
        add.addActionListener(this);
        del.addActionListener(this);
        search.addActionListener(this);
        cap.addActionListener(this);
        this.add(add);
        this.add(del);
        this.add(search);
        this.add(cap);
        //Create the output field
        out = new Label();
        this.add(out);
    }

    //Function to perform the selected option
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        int number = Integer.valueOf(num.getText());
        if (button.equals("Add")) {
            if (vec.add(number))
                out.setText(number + " added successfully");
            else
                out.setText(number + " could not be added");
        } else if (button.equals("Delete")) {
            if (vec.removeElement(number))
                out.setText(number + " deleted successfully");
            else
                out.setText(number + " could not be deleted");
        } else if (button.equals("Search")) {
            if (vec.contains(number))
                out.setText(number + " found at index " + vec.indexOf(number));
            else
                out.setText(number + " not found");
        } else {
            out.setText("Size of vector is " + vec.size());
        }
        list.setText("Vector is : " + vec);
    }
}
