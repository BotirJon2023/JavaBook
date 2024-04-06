package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class GsonRemoveKeyExample {

    public static void main(String[] args) {

        String jsonData = "{\"name\": \"Bob\",\"age\": 23,\"department\": {\"name\": \"IT\",\"position\": {\"role\": \"lead\", \"years\": 3}}}";


        JsonObject jsonObject = new Gson().fromJson(jsonData, JsonObject.class);

        System.out.println("Original JSON: " + jsonObject);


        JsonObject positionObject = jsonObject
                .get("department").getAsJsonObject()
                .get("position").getAsJsonObject();


        positionObject.remove("years");

        System.out.println("Modified JSON: " + jsonObject);
    }
}