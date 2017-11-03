package com.company;

import java.util.Map;

public class Event {

    public String eventKey;
    public Map<String, Float> oprs = null;
    public Map<String, Float> ccwms = null;
    public Map<String, Float> dprs = null;


    public Event(){
        //no args constructor for GSON
    }
}
