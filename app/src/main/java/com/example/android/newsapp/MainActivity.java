package com.example.android.newsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private NewsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<News> newsList = new ArrayList<>();
        newsList.add(new News("Politics", "Theresa May rules out participating in TV debates before election", "2017-04-18", "17:20"));
        newsList.add(new News("Politics", "Theresa May rules out participating in TV debates before election", "2017-04-18", "17:20"));

        ListView newsListView = (ListView) findViewById(R.id.list);
        mAdapter = new NewsAdapter(this, newsList);

        newsListView.setAdapter(mAdapter);

    }
}
