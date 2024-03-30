package org.example;

import java.io.FileWriter;
import java.io.Writer;
import com.google.gson.Gson;
public class GsonWriteJSONToFileExample {

    public static void main(String[] args) {

        //file path we want to write to
        String strFilePath = "D:\\employees.json";

        //Employee objects we want to save to a file
        Emp emp1 = new Emp("EMP1", "John", 23);

        //create a write object for the file
        try (Writer writerObject = new FileWriter(strFilePath)) {

            Gson gsonObject = new Gson();

            /*
             * Use the toJson method and specify
             * the writer and the object we want to write
             */
            gsonObject.toJson(emp1, writerObject);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Emp {

    private String id;
    private String name;
    private int age;

    public Emp(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
