package com.dat.testslidingtabs2.adapter_n_shits;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dat.testslidingtabs2.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by DAT on 7/6/2015.
 */
public class CustomAdapterFragment1 extends RecyclerView.Adapter<CustomAdapterFragment1.MyViewHolder> {
    private LayoutInflater inflater;
    List<Dummy> dummyList = Collections.emptyList();        //maybe this shit is better than null lmao


    public CustomAdapterFragment1(Context context, List<Dummy> dummyList) {
        inflater = LayoutInflater.from(context);
        this.dummyList = dummyList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.custom_row2, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewholder, int position) {
        Dummy dummy = dummyList.get(position);
        myViewholder.textViewName.setText(dummy.getName());
        myViewholder.textViewAddress.setText(dummy.getAddress());
        myViewholder.imageViewID.setImageResource(dummy.getImageid());
        myViewholder.imageViewID.setScaleType(ImageView.ScaleType.CENTER);
    }

    @Override
    public int getItemCount() {
        return dummyList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewID;
        TextView textViewName, textViewAddress;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageViewID = (ImageView) itemView.findViewById(R.id.imageViewID);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewAddress = (TextView) itemView.findViewById(R.id.textViewAddress);
        }
    }
}
