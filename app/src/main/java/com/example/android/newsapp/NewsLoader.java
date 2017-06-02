package com.example.android.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by Elias on 02/06/2017.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private static final String REQUEST_URL = "http://content.guardianapis.com/search?q=android&api-key=6803ba00-f22f-4319-90e9-3b76d573e632";

    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {

        List<News> news = QueryUtils.fetchNewsData(REQUEST_URL);
        return news;
    }
}
