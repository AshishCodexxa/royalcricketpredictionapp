package com.cricketscoreprediction.app.Models;

import com.cricketscoreprediction.app.ListseriesQuery;
import java.util.ArrayList;

public class ModelSeries {
    String month;
    ArrayList<ListseriesQuery.Series> upcomingSeries;

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String str) {
        this.month = str;
    }

    public ArrayList<ListseriesQuery.Series> getUpcomingSeries() {
        return this.upcomingSeries;
    }

    public void setUpcomingSeries(ArrayList<ListseriesQuery.Series> arrayList) {
        this.upcomingSeries = arrayList;
    }
}
