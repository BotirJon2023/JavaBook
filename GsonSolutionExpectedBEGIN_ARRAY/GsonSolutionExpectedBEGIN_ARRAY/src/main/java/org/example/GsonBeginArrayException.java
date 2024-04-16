package org.example;

import java.util.List;

import com.google.gson.Gson;

public class GsonBeginArrayException {

    public static void main(String[] args) {

        String jsonData = "{\"id\": 1,\"name\": \"Bob\",\"departments\": [\"HR\", \"ERP\"]}";

        Employee[] employees = new Gson().fromJson(jsonData, Employee[].class);

        System.out.println(employees);
    }
}

class Employee{

    private String id;
    private String name;
    List<String> departments;

    public List<String> getDepartments() {
        return departments;
    }
    public void setDepartments(List<String> departments) {
        this.departments = departments;
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
}
