package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Elias on 01/06/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(@NonNull Context context, List<News> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView category = (TextView) listItemView.findViewById(R.id.category_view);
        category.setText(currentNews.getmCategory());

        TextView title = (TextView) listItemView.findViewById(R.id.title_view);
        title.setText(currentNews.getmTitle());

        TextView date = (TextView) listItemView.findViewById(R.id.date_view);
        date.setText(currentNews.getmDate());

        TextView time = (TextView) listItemView.findViewById(R.id.time_view);
        time.setText(currentNews.getmTime());

        return listItemView;
    }
}
