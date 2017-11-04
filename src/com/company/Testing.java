package com.company;

import java.io.IOException;

public class Testing {
    public static void main(String[] args) throws IOException {

        ApiClient api = new ApiClient();

        Event carver = new Event();
        carver.eventKey = "2017carv";

        carver.pwrRatings = api.findPowerRatings(carver);
        carver.eventRankings = api.findRankings(carver);

        System.out.println(carver.pwrRatings.oprs.keySet());

        for(EventRankingsData.Rankings r : carver.eventRankings.rankings){
            System.out.println(r.team_key);
        }


    }
}
