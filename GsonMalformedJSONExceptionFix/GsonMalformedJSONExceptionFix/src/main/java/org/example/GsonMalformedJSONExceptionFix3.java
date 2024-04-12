package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class GsonMalformedJSONExceptionFix3 {

    String jsonData = "{\"id\": 1,\"name\": \"Bob\",\"subjects\": [\"Maths\", \"Chemistry\"]}";

    Gson gson = new Gson();

    //trim the input JSON
    JsonObject2 jsonObject2 = gson.fromJson(jsonData.trim(), JsonObject2.class);

System.out.println(jsonObject2);

}
