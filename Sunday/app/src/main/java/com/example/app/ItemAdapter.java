package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Hor on 09/05/14.
 */
public class ItemAdapter extends BaseAdapter {
    LayoutInflater inflater;
    List<Item> listItem;

    public ItemAdapter(Context context,List<Item> biblioItem) {
        inflater = LayoutInflater.from(context);
        this.listItem = biblioItem;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
