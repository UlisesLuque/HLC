package com.example.wwwul.baloncesto;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class dialogoReiniciar extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.deseaReiniciar)
                .setPositiveButton(R.string.reiniciarSi, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.contadorLocal = 0;
                        MainActivity.contadorVisitante = 0;
                        MainActivity.puntuacionLocal.setText("0");
                        MainActivity.puntuacionVisitante.setText("0");
                    }
                })
                .setNegativeButton(R.string.reinicarNo, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }


}
