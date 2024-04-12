package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class GsonMalformedJSONExceptionFix {

    public static void main(String[] args) {

        String jsonData = "{\"id\": 1,\"name\": \"Bob,\"subjects\": [\"Maths\", \"Chemistry\"]}";

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonData, JsonObject.class);

        System.out.println(jsonObject);
    }

}
