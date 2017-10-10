package com.example.anando.hciapp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import com.example.anando.hciapp.R;

import java.util.ArrayList;

/**
 * Created by anando on 10-Oct-17.
 */
public class activityplanAdapter extends BaseAdapter {
    Activity activity;
    ArrayList<String> list;
    public activityplanAdapter(Activity activity , ArrayList<String> list){
        this.list = list;
        this.activity = activity;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.plancard , viewGroup , false);
        }
        return view;
    }
}
