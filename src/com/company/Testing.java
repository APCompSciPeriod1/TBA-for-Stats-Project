package com.company;

import java.io.IOException;

public class Testing {
    public static void main(String[] args) throws IOException {

        ApiClient api = new ApiClient();

        Event carver = new Event();
        carver.eventKey = "2017carv";

        carver = api.findEventOPR(carver);

        System.out.println(carver.oprs.keySet());


    }
}
