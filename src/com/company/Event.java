package com.company;

import java.util.Map;

public class Event {

    public String eventKey;
    public PowerRatingData pwrRatings = new PowerRatingData();
    public EventRankingsData eventRankings = new EventRankingsData();

    public Event(){
        //no args constructor for GSON
    }
}
