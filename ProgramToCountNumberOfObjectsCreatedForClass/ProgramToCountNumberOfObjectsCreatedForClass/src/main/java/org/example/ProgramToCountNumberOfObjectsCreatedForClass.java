package org.example;

public class ProgramToCountNumberOfObjectsCreatedForClass {

    static int count = 0;

    void ProgramToCountNumberOfObjectsCreatedForClass() {
        count++;
    }

    public static void main(String[] args) {
        ProgramToCountNumberOfObjectsCreatedForClass obj1 = new ProgramToCountNumberOfObjectsCreatedForClass();
        ProgramToCountNumberOfObjectsCreatedForClass obj2 = new ProgramToCountNumberOfObjectsCreatedForClass();
        ProgramToCountNumberOfObjectsCreatedForClass obj3 = new ProgramToCountNumberOfObjectsCreatedForClass();
        ProgramToCountNumberOfObjectsCreatedForClass obj4 = new ProgramToCountNumberOfObjectsCreatedForClass();
        System.out.println("Number of objects created:" + count);
    }
}
