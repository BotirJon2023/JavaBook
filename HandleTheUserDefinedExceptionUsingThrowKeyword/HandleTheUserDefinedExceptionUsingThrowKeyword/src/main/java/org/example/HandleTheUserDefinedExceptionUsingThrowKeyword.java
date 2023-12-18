package org.example;

import java.util.Scanner;
public class HandleTheUserDefinedExceptionUsingThrowKeyword extends Exception {

    String msg;
    void NegativeAmtException(String msg)
    {
        this.msg=msg;
    }
    public String toString()
    {
        return msg;
    }
}
