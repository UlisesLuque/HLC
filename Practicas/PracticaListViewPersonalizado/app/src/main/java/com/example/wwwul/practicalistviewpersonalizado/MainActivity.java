package com.example.wwwul.practicalistviewpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listViewOpciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewOpciones = (ListView) findViewById(R.id.listViewOpciones);

        Titular[] datos = new Titular[]{
                new Titular("España", R.drawable.spain),
                new Titular("Andorra", R.drawable.andorra),
                new Titular("Belgica", R.drawable.belgica),
                new Titular("Irlanda", R.drawable.irlanda),
                new Titular("Noruega", R.drawable.noruega),
                new Titular("Turquia", R.drawable.turquia),
        };

        AdaptadorTitulares adatador = new AdaptadorTitulares(this, datos);

        listViewOpciones.setAdapter(adatador);
    }
}
