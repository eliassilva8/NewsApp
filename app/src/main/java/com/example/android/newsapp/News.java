package com.example.android.newsapp;

/**
 * Created by Elias on 01/06/2017.
 */

public class News {
    private String mCategory;
    private String mTitle;
    private String mDate;
    private String mUri;

    public News(String mCategory, String mTitle, String mDate, String mUri) {
        this.mCategory = mCategory;
        this.mTitle = mTitle;
        this.mDate = mDate;
        this.mUri = mUri;
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

    public String getmUri() {
        return mUri;
    }
}
