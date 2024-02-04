package org.example;

import java.util.ArrayList;

public class PassArrayListAsTheFunctionArgument2 {

    public static void percentage(Integer[] marks) {
        int totalMarks = 300;
        int obtainedMarks = 0;
        for (int mark : marks) {
            obtainedMarks += mark;
        }


        double percent = (obtainedMarks * 100) / totalMarks;
        System.out.println("Percentage: " + percent);
    }

    public static void main(String[] args) {


        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(67);
        marks.add(87);
        marks.add(56);
        System.out.println("Marks: " + marks);

        percentage(marks.toArray(new Integer[marks.size()]));
    }
}
