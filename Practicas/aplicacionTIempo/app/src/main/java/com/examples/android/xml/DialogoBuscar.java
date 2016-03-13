package com.examples.android.xml;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by wwwul on 13/03/2016.
 */
public class DialogoBuscar extends DialogFragment {
    private EditText etCiudad;
    private EditText etCoordLon;
    private EditText etCoordLat;
    private String cadena;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();



        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.buscar, null))
                // Add action buttons
                .setPositiveButton(R.string.buscar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        cadena = "";
                        CargarXmlTask tarea = new CargarXmlTask();
                        etCiudad = (EditText) DialogoBuscar.this.getDialog().findViewById(R.id.etCiudad);
                        etCoordLon = (EditText) DialogoBuscar.this.getDialog().findViewById(R.id.etCoordLon);
                        etCoordLat = (EditText) DialogoBuscar.this.getDialog().findViewById(R.id.etCoordLat);

                        if(!etCiudad.getText().toString().equals("")){
                            cadena +=  "q=" + etCiudad.getText().toString();
                        }

                        if(!etCoordLon.getText().toString().equals("") && !etCoordLat.getText().toString().equals("")){
                            String latitud = etCoordLat.getText().toString();
                            String longitud = etCoordLon.getText().toString();
                            if(Integer.parseInt(latitud) < 91 && Integer.parseInt(latitud) > -91)
                                cadena += "lat=" + etCoordLat.getText().toString();
                            else
                                cadena += "lat=" + "0";
                            if(Integer.parseInt(longitud) < 180 && Integer.parseInt(longitud) > -1)
                                cadena += "&lon=" + etCoordLon.getText().toString();
                            else
                                cadena += "lon=" + "0";

                        }

                        if (!etCiudad.getText().toString().equals("") || (!etCoordLon.getText().toString().equals("") && !etCoordLon.getText().toString().equals(""))){
                            String url = "http://api.openweathermap.org/data/2.5/weather?" + cadena + "&lang=es&units=metric&mode=xml&appid=7c35b4150638f67554e2148011b5d934";
                            tarea.execute(url);

                        }
                    }
                })
                .setNegativeButton(R.string.cancelar, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        DialogoBuscar.this.getDialog().cancel();
                    }
                });
        return builder.create();
    }

}
