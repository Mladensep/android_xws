package com.example.mladen.xwsclient.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mladen.xwsclient.R;
import com.example.mladen.xwsclient.model.Uplatnica;

import java.util.List;


public class IzvodAdapter extends BaseAdapter {

    private Context context;
    private List<Uplatnica> model;


    public IzvodAdapter(Context context, List<Uplatnica> model) {
        this.context = context;
        this.model = model;
    }

    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public Object getItem(int position) {
        return model.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater li = LayoutInflater.from(context);
            convertView = li.inflate(R.layout.item_izvoid, null, false);
        }

        Uplatnica uplatnica = model.get(position);

        TextView textView = (TextView) convertView.findViewById(R.id.cena_id);
        textView.setText("Cena proizvoda: " + uplatnica.getCena() + "  \n  " + " \n " + "Svrha placanja: " + uplatnica.getSvrhaPlacanja());


        return convertView;
    }
}