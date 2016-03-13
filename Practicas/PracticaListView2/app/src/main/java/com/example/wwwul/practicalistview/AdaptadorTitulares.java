package com.example.wwwul.practicalistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by wwwul on 23/01/2016.
 */
class AdaptadorTitulares extends ArrayAdapter<Titular> {

    private Titular[] datos;

    public AdaptadorTitulares(Context context, Titular[] datos) {
        super(context, R.layout.listitem_titular, datos);
        this.datos = datos;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listitem_titular, null);

        TextView lblTiulo = (TextView)item.findViewById(R.id.LblTitulo);
        lblTiulo.setText(datos[position].getTitulo());

        TextView lblSubtitulo = (TextView)item.findViewById(R.id.LblSubTitulo);
        lblSubtitulo.setText(datos[position].getSubtitulo());

        return (item);
    }
}
