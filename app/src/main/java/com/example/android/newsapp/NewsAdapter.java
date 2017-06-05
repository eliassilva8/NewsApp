package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

        ViewHolder viewHolder;

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.category = (TextView) listItemView.findViewById(R.id.category_view);
            viewHolder.title = (TextView) listItemView.findViewById(R.id.title_view);
            viewHolder.date = (TextView) listItemView.findViewById(R.id.date_view);
            viewHolder.time = (TextView) listItemView.findViewById(R.id.time_view);
            listItemView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) listItemView.getTag();
        }
        News currentNews = getItem(position);

        viewHolder.category.setText(currentNews.getmCategory());
        viewHolder.title.setText(currentNews.getmTitle());

        String fullDateString = currentNews.getmDate();
        SimpleDateFormat fullDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        try {
            Date newDate = fullDateFormat.parse(fullDateString);

            fullDateFormat = new SimpleDateFormat("MMM-dd");
            String date = fullDateFormat.format(newDate);
            viewHolder.date.setText(date);

            fullDateFormat = new SimpleDateFormat("HH:mm");
            String time = fullDateFormat.format(newDate);
            viewHolder.time.setText(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return listItemView;
    }

    static class ViewHolder {
        TextView category;
        TextView title;
        TextView date;
        TextView time;
    }
}

