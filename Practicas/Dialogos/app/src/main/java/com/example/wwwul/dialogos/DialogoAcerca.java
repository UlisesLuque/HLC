package com.example.wwwul.dialogos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by wwwul on 13/01/2016.
 */
public class DialogoAcerca extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder dialogo = new AlertDialog.Builder(getActivity());

        dialogo.setMessage("IESGC. Desarrollo de aplicaciones web.")
                .setTitle("Acerca de")
                .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        dialog.cancel();
                    }
                });
        return dialogo.create();
    }

}
