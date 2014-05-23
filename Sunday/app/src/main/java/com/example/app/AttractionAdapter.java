package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Hor on 09/05/14.
 */
public class AttractionAdapter extends BaseAdapter {
    List<Activite> listA;
    LayoutInflater inflater;

    public AttractionAdapter(Context context,List<Activite> biblioAttract) {
        inflater = LayoutInflater.from(context);
        this.listA = biblioAttract;
    }
    @Override
    public int getCount() {
        return listA.size();
    }

    @Override
    public Object getItem(int i) {
        return listA.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if(view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.liste_attractions, null);

            holder.attractionNom = (TextView)view.findViewById(R.id.attractionNom);
            holder.attractionImg = (ImageView)view.findViewById(R.id.attractionImg);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.attractionNom.setText(listA.get(i).getNom());
        holder.attractionImg.setImageDrawable(listA.get(i).getImg());

        return view;
    }

    private class ViewHolder {
        TextView attractionNom;
        ImageView attractionImg;
    }
}
