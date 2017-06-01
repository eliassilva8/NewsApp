package com.example.android.newsapp;

/**
 * Created by Elias on 01/06/2017.
 */

public class News {
    private String mCategory;
    private String mTitle;
    private String mDate;
    private String mTime;

    public News(String mCategory, String mTitle, String mDate, String mTime) {
        this.mCategory = mCategory;
        this.mTitle = mTitle;
        this.mDate = mDate;
        this.mTime = mTime;
    }

    public String getmCategory() {
        return mCategory;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmTime() {
        return mTime;
    }
}
