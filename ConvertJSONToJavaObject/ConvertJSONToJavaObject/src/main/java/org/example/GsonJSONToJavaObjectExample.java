package org.example;


import com.google.gson.Gson;

public class GsonJSONToJavaObjectExample {

    public static void main(String[] args) {


        String strJSON = "{\"id\":\"EMP001\", \"name\":\"Alex\"}";


        Employee emp = new Gson().fromJson(strJSON, Employee.class);

        System.out.println("Id: " + emp.getId());
        System.out.println("Name: " + emp.getName());
    }
}

class Employee {

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
