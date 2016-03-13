package com.example.wwwul.practicapuntosdeinteres;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by wwwul on 28/01/2016.
 */
public class AdaptadorTitulares extends ArrayAdapter<PuntoInteres>{

    private PuntoInteres[] datos;
    public AdaptadorTitulares(Context context, PuntoInteres[] datos) {
        super(context, R.layout.list_item_layout, datos);
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflador = LayoutInflater.from(getContext());
        View item = inflador.inflate(R.layout.list_item_layout, null);

        TextView tvTitulo = (TextView) item.findViewById(R.id.tvTitulo);
        tvTitulo.setText(datos[position].getTitulo());

        TextView tvDescripcion = (TextView) item.findViewById(R.id.tvDescripcion);
        tvDescripcion.setText(datos[position].getDescripcion());

        ImageView ivImagen = (ImageView) item.findViewById(R.id.ivImagen);
        ivImagen.setImageResource(datos[position].getImagen());

        return item;
    }
}
