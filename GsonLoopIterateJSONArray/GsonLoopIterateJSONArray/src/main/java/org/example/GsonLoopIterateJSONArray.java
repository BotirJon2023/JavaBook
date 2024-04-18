package org.example;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class GsonLoopIterateJSONArray {

    public static void main(String[] args) {

        String jsonData = "{ \"Id\": \"EMP001\", "
                + "\"Name\": \"Alex\", \"Age\": 22, "
                + "\"IsManager\": false, "
                + "\"ReservedParking\": null, "
                + "\"Languages\": [\"English\", \"Spanish\"], "
                + "\"Experience\": [ { \"CompanyName\": \"ABC Ltd.\", \"Years\": 2.5 }, { \"CompanyName\": \"XYZ Ltd.\", \"Years\": 3 } ] "
                + "}";

        JsonObject jsonObject = JsonParser.parseString(jsonData).getAsJsonObject();

        JsonArray experienceArray = jsonObject.get("Experience").getAsJsonArray();

        for(JsonElement experienceElement : experienceArray) {

            JsonObject companyObject = experienceElement.getAsJsonObject();

            System.out.println(companyObject.get("CompanyName")
                    + " => "
                    + companyObject.get("Years"));
        }

    }

}
