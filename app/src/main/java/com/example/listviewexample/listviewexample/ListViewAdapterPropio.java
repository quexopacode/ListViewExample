package com.example.listviewexample.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.listviewexample.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapterPropio extends ArrayAdapter<Titulos>
{

    private  List<Titulos> opciones = new ArrayList<>();

    public ListViewAdapterPropio(Context context, List<Titulos> datos){
        super(context, R.layout.listview_template, datos);

        opciones= datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listview_template, null);
        TextView lblTitulo = (TextView)item.findViewById(R.id.lblTitulo);
        lblTitulo.setText(opciones.get(position).getTitulo());
        TextView lblSubtitulo = (TextView)item.findViewById(R.id.lblSubTitulo);
        lblSubtitulo.setText(opciones.get(position).getSubtitulo());
        TextView lblNota = (TextView)item.findViewById(R.id.lblNota);
        lblNota.setText(opciones.get(position).getNota());
        return(item);
    }
}
