package org.example;


import java.io.FileWriter;
import java.io.Writer;

import com.google.gson.Gson;

public class GsonWriteJSONToFileExample {

    public static void main(String[] args) {


        String strFilePath = "D:\\employees.json";


        Emp emp1 = new Emp("EMP1", "John", 23);


        try(Writer writerObject = new FileWriter(strFilePath)){

            Gson gsonObject = new Gson();


            gsonObject.toJson(emp1, writerObject);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
