package org.example;

public class AddTwoComplexNumbersByPassingClassToAFunction {

    double real;
    double imag;

    public AddTwoComplexNumbersByPassingClassToAFunction(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
        AddTwoComplexNumbersByPassingClassToAFunction n1 = new AddTwoComplexNumbersByPassingClassToAFunction(2.3, 4.5),
                n2 = new AddTwoComplexNumbersByPassingClassToAFunction(3.4, 5.0),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static AddTwoComplexNumbersByPassingClassToAFunction add(AddTwoComplexNumbersByPassingClassToAFunction n1, AddTwoComplexNumbersByPassingClassToAFunction n2) {
        AddTwoComplexNumbersByPassingClassToAFunction temp = new AddTwoComplexNumbersByPassingClassToAFunction(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return (temp);
    }
}
