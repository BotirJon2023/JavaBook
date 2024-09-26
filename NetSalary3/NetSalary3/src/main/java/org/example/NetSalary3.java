package org.example;

public class NetSalary3 {

    public static void main(String arg[]) {

        double gs, it, pt, pf, netSalary;

        gs = Double.parseDouble(arg[0]);

        System.out.println("Gross salary is = " + gs);

        it = Double.parseDouble(arg[1]);

        System.out.println("Income Tax percentage is = " + it);

        pt = Double.parseDouble(arg[2]);

        System.out.println("Professional Tax percentage is = " + pt);

        pf = Double.parseDouble(arg[3]);

        System.out.println("Provident Fund percentage is = " + pf);

        pf = pf * (gs / 100);

        it = it * (gs / 100);

        pt = pt * (gs / 100);

        netSalary = gs - it - pt - pf;

        System.out.println("Net Salary is=" + netSalary);
    }

}
