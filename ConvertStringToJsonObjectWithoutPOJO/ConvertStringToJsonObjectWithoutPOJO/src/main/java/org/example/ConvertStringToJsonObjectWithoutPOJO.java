package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ConvertStringToJsonObjectWithoutPOJO {

    String jsonData = "{\"Id\": \"EMP002\","
            + "\"Name\": \"John\","
            + "\"Age\": 41,"
            + "\"IsManager\": true,"
            + "\"ReservedParking\": \"PARK001\","
            + "\"Languages\": [\"English\", \"German\", \"Italian\"],"
            + "\"Experience\": [{\"CompanyName\": \"AA Ltd.\",\"Years\": 12},{\"CompanyName\": \"BB Ltd.\",\"Years\": 9}]}";


    JsonObject jsonObject = new Gson().fromJson(jsonData, JsonObject.class);



        System.out.println("Name: "+jsonObject.get("Name").getAsString());


        System.out.println("Age: "+jsonObject.get("Age").getAsInt());


        System.out.println("IsManager: "+jsonObject.get("IsManager").getAsBoolean());


    JsonArray arrayLanguages = jsonObject.get("Languages").getAsJsonArray();


        for(
    JsonElement element :arrayLanguages)

    {
        System.out.println(element.getAsString());
    }


    JsonArray arrayExperience = jsonObject.get("Experience").getAsJsonArray();

        System.out.println("Companies =>");

        for(
    JsonElement element: arrayExperience)

    {

        JsonObject jsonObjectExperience = element.getAsJsonObject();
        System.out.println("CompanyName: " + jsonObjectExperience.get("CompanyName").getAsString());
        System.out.println("Years: " + jsonObjectExperience.get("Years").getAsString());
    }


}
