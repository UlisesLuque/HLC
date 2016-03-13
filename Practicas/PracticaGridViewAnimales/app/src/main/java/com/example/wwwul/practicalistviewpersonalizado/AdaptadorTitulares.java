package com.example.wwwul.practicalistviewpersonalizado;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by wwwul on 23/01/2016.
 */
public class AdaptadorTitulares extends ArrayAdapter<Titular>{

    private Titular[] datos;

    public AdaptadorTitulares(Context context, Titular[] datos){
        super(context, R.layout.listitem_titular, datos);
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listitem_titular, null);

        ImageView ivBandera = (ImageView) item.findViewById(R.id.ivImagen);
        ivBandera.setImageResource(datos[position].getRecurso());

        return item;
    }
}
