package com.example.android.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by Elias on 02/06/2017.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    private String mUri;

    public NewsLoader(Context context, String uri) {
        super(context);
        mUri = uri;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {

        List<News> news = QueryUtils.fetchNewsData(mUri);
        return news;
    }
}

