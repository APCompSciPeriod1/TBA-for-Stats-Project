package com.company;

import java.util.*;

public class EventRankingsData {

    public ArrayList<Rankings> rankings = new ArrayList<>();

    public class Rankings{
        public int dq;
        public int matches_played;
        public int qual_average;
        public int rank;
        public WLT_Record record = new WLT_Record();
        //TODO: sort  orders array = ???
        //public
        public String team_key;


        public class WLT_Record{
            public int losses;
            public int wins;
            public int ties;
        }
    }

    public class sort_order_info{
        public String name;
        public int precision;
    }


}

