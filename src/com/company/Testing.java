package com.company;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Testing {
    public static void main(String[] args) {





        OkHttpClient client = new OkHttpClient();

        Request testRequest = new Request.Builder()
                .header("X-TBA-Auth-Key", "7vZhyHvokchmeYDJwgH414fXEA49C2QZ2adr56C1jjC14g9Abdqy0CJqswoEsK9y")
                .url("https://www.thebluealliance.com/api/v3")
                .build();


        //me and josh forgot to return the grid at the end


    }
}
