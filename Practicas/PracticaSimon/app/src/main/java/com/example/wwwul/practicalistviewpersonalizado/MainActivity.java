package com.example.wwwul.practicalistviewpersonalizado;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private GridView gridViewOpciones;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridViewOpciones = (GridView) findViewById(R.id.gridViewOpciones);

        Titular[] datos = new Titular[]{
                new Titular("Gallo", R.drawable.gallo, R.raw.gallo),
                new Titular("Gato", R.drawable.gato, R.raw.gato),
                new Titular("Vaca", R.drawable.vaca, R.raw.vaca),
                new Titular("Elefante", R.drawable.elefante, R.raw.elefante),
                new Titular("Delfín", R.drawable.delfin, R.raw.delfin),
                new Titular("León", R.drawable.leon, R.raw.leon),
                new Titular("Cuervo", R.drawable.cuervo, R.raw.cuervo),
                new Titular("Caballo", R.drawable.caballo, R.raw.caballo),
        };



        AdaptadorTitulares adatador = new AdaptadorTitulares(this, datos);

        gridViewOpciones.setAdapter(adatador);

        gridViewOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(mp != null){
                    mp.stop();
                }
                int idSonido = ((Titular) parent.getItemAtPosition(position)).getSonido();
                mp = MediaPlayer.create(MainActivity.this, idSonido);
                mp.start();
            }
        });
    }
}
