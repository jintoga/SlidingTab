package com.dat.testslidingtabs2.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import com.dat.testslidingtabs2.R;
import com.dat.testslidingtabs2.adapter_n_shits.CustomAdapterFragment1;
import com.dat.testslidingtabs2.adapter_n_shits.CustomAdapterUseLib;
import com.dat.testslidingtabs2.adapter_n_shits.Dummy;
import com.etsy.android.grid.StaggeredGridView;

import java.util.ArrayList;
import java.util.List;


public class MyFragment1 extends Fragment {
    //StaggeredGridView recyclerView;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    //ListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1_layout, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        adapter = new CustomAdapterFragment1(getActivity(), getDummyData());
        // adapter = new CustomAdapterUseLib(getActivity(), android.R.layout.simple_list_item_1, getDummyData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        return view;
    }

    public List<Dummy> getDummyData() {
        List<Dummy> dummyList = new ArrayList<>();
        String[] name = {"Dat 123", "Dat 424", "asf asf as", "241 asf", "23425 zzz", "2aa 123", "bar 424", "asfzz2 asf as", "241 s", "55 azzsf"};
        String[] address = {"2aa 123", "bar 424", "asfzz2 asf as", "241 s", "55 azzsf", "2aa 123", "bar 424", "asfzz2 asf as", "241 s", "55 azzsf"};
        int[] imgID = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.test3,
                R.drawable.test4, R.drawable.img10, R.drawable.test1, R.drawable.test3, R.drawable.img8};
        for (int i = 0; i < name.length && i < address.length && i < imgID.length; i++) {
            Dummy dummy = new Dummy(name[i], address[i], imgID[i]);
            dummyList.add(dummy);
        }
        return dummyList;
    }


}
