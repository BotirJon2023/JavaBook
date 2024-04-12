package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class GsonMalformedJSONExceptionFix2 {

    String jsonData = "{\"id\": 1,\"name\": \"Bob\",\"subjects\": [\"Maths\", \"Chemistry\"]}";


    Gson gson = new GsonBuilder().setLenient().create();

    JsonObject1 jsonObject1 = gson.fromJson(jsonData, JsonObject1.class);

System.out.println(jsonObject1);

}
