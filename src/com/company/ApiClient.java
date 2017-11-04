package com.company;

import java.io.IOException;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ApiClient {

    private String headerKey = "7vZhyHvokchmeYDJwgH414fXEA49C2QZ2adr56C1jjC14g9Abdqy0CJqswoEsK9y";
    private String headerName = "X-TBA-Auth-Key";

    OkHttpClient client = new OkHttpClient();
    Gson gson = new Gson();

    String run(String urlModifier) throws IOException {
        Request request = new Request.Builder()
                .header(headerName,headerKey)
                .url("https://www.thebluealliance.com/api/v3"+urlModifier)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }


    public PowerRatingData findPowerRatings(Event event) throws IOException{

        String modifier = "/event/" + event.eventKey + "/oprs";

        String response = run(modifier);

        return gson.fromJson(response,PowerRatingData.class);

    }

    public EventRankingsData findRankings(Event event) throws IOException{

        String modifier = "/event/" + event.eventKey + "/rankings";

        String response = run(modifier);

        return gson.fromJson(response,EventRankingsData.class);
    }
}