package org.example;

import java.net.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class ProgramToShowTheUseOfVariousMethodsOfURLClass  extends Applet implements ActionListener
{
    TextField url_field;
    TextField out;
    //Function to initialize the applet
    public void init()
    {
        setBackground(Color.white);
        setLayout(null);
        //Create a label
        Label label = new Label();
        label.setText("Enter an URL : ");
        label.setBounds(50,50,100,50);
        this.add(label);
        //Create a text field
        url_field = new TextField();
        url_field.setBounds(150,50,250,50);
        this.add(url_field);
        //Create a textfield for output
        out = new TextField();
        out.setBounds(100,250,300,50);
        this.add(out);
    }
    //Function to set features to the applet
    public void start()
    {
        //Create buttons for method options
        Button protocol = new Button("Get Protocol");
        protocol.setBounds(0,150,100,50);
        protocol.addActionListener(this);
        this.add(protocol);
        Button host = new Button("Get Host");
        host.setBounds(100,150,100,50);
        host.addActionListener(this);
        this.add(host);
        Button port = new Button("Get Port");
        port.setBounds(200,150,100,50);
        port.addActionListener(this);
        this.add(port);
        Button query = new Button("Get Query");
        query.setBounds(300,150,100,50);
        query.addActionListener(this);
        this.add(query);
        Button file = new Button("Get File");
        file.setBounds(400,150,100,50);
        file.addActionListener(this);
        this.add(file);
    }
    //Function to perform the option selected
    public void actionPerformed(ActionEvent e)
    {
        String button = e.getActionCommand();
        try
        {
            URL url = new URL(url_field.getText());
            if(button.equals("Get Protocol"))
                out.setText("Protocol : "+url.getProtocol());

            else if(button.equals("Get Host"))
                out.setText("Host :"+url.getHost());

            else if(button.equals("Get Port"))
                out.setText("Port : "+url.getPort());

            else if(button.equals("Get Query"))
                out.setText("Query String : "+url.getQuery());

            else
                out.setText("File : "+url.getFile());
        }
        catch(Exception exc)
        {
            out.setText(exc.getMessage());
        }
    }
}