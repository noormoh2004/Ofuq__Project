package com.example.ofuqproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ofuqproject.R;
import com.example.ofuqproject.model.AdviceModel;

import java.util.ArrayList;

public class AdviceAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<AdviceModel> adviceList;
    private LayoutInflater inflater;


    public AdviceAdapter(Context context, ArrayList<AdviceModel> adviceList) {
        this.context = context;
        this.adviceList = adviceList;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return adviceList.size();
    }

    @Override
    public Object getItem(int i) {
        return adviceList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View root = inflater.inflate(R.layout.item_advice, parent, false);
        // ربط عناصر الـ XML الموجودة في البطاقة
        TextView tvTitle = root.findViewById(R.id.tvAdviceTitle);
        TextView tvDesc = root.findViewById(R.id.tvAdviceDesc);
        ImageView imgAdvice = root.findViewById(R.id.imgAdvice);

        // تعبئة البيانات لكل عنصر بناءً على موقعه (position)
        tvTitle.setText(adviceList.get(position).getTitle());
        tvDesc.setText(adviceList.get(position).getDescription());
        imgAdvice.setImageResource(adviceList.get(position).getImageResId());
        return root;
    }
}
