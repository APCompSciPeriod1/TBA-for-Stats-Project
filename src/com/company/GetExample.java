package com.company;

import java.io.IOException;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetExample {
    OkHttpClient client = new OkHttpClient();

    String run(String url, String headerName, String headerKey) throws IOException {
        Request request = new Request.Builder()
                .header(headerName,headerKey)
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {

        String response  = findEventOPR("2017carv");

        Gson gson = new Gson();

        //String stringtest = gson.fromJson(response, String.class);







        System.out.println(response);

    }

    public static String findEventOPR(String eventKey) throws IOException{
        GetExample example = new GetExample();
        String modifier = "/event/" + eventKey + "/oprs";
        String response = example.run("https://www.thebluealliance.com/api/v3"+modifier,"X-TBA-Auth-Key", "7vZhyHvokchmeYDJwgH414fXEA49C2QZ2adr56C1jjC14g9Abdqy0CJqswoEsK9y");
        return response;

    }
}