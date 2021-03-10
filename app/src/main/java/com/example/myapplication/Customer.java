package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Customer extends BaseAdapter  {
    Context ctx;
    int layoutItem;
    ArrayList<Ao> arrayList;

    public Customer(Context ctx, int layoutItem, ArrayList<Ao> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvmoney = view.findViewById(R.id.tvmoney);
        ImageView img = view.findViewById(R.id.img);
        tvName.setText(arrayList.get(i).getName());
        tvmoney.setText(arrayList.get(i).getMoney());
        img.setImageResource(arrayList.get(i).getImg());
        return view;
    }
}
