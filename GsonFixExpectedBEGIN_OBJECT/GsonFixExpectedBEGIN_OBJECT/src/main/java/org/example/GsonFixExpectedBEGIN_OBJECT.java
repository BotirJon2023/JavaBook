package org.example;

import com.google.gson.Gson;

public class GsonFixExpectedBEGIN_OBJECT {

    public static void main(String[] args) {

        String jsonData = "[{\"id\": 1,\"name\": \"Bob\"},{\"id\": 2,\"name\": \"Raj\"}]";

        Student student = new Gson().fromJson(jsonData, Student.class);

        System.out.println(student.getId() + " => " + student.getName());
    }
}


class Student{

    private String id;
    private String name;

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

}
