package com.dat.testslidingtabs2.adapter_n_shits;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.dat.testslidingtabs2.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by DAT on 7/6/2015.
 */
public class CustomAdapterUseLib extends ArrayAdapter {
    private LayoutInflater inflater;
    List<Dummy> dummyList = Collections.emptyList();        //maybe this shit is better than null lmao


    public CustomAdapterUseLib(Context context, int textViewResourceId, List<Dummy> dummyList) {
        super(context, textViewResourceId, dummyList);
        inflater = LayoutInflater.from(context);
        this.dummyList = dummyList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MyViewHolder2 vh;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.custom_row2,
                    parent, false);
            vh = new MyViewHolder2();
            vh.imageViewID = (ImageView) convertView
                    .findViewById(R.id.imageViewID);
            convertView.setTag(vh);
        } else {
            vh = (MyViewHolder2) convertView.getTag();
        }
        Dummy dummy = dummyList.get(position);
        vh.imageViewID.setImageResource(dummy.getImageid());
        vh.imageViewID.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return convertView;
    }

    public static class MyViewHolder2 {
        ImageView imageViewID;
        TextView textViewName, textViewAddress;

    }
}
