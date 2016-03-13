package com.example.wwwul.practicapuntosdeinteres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private PuntoInteres[] puntosDeInteres= new PuntoInteres[]{
         new PuntoInteres(R.string.tituloMezquita, R.string.descripcionMezquita, R.drawable.mezquita_description),
            new PuntoInteres(R.string.tituloAlcazar, R.string.descripcionAlcazar, R.drawable.alcazar_description),
            new PuntoInteres(R.string.tituloAlhambra, R.string.descripcionAlhambra, R.drawable.alhambra_description),
            new PuntoInteres(R.string.tituloTorreDelOro, R.string.descripcionTorreDelOro, R.drawable.torre_del_oro_description),
            new PuntoInteres(R.string.tituloAlcazar, R.string.descripcionAlcazaba, R.drawable.alcazaba_description),
            new PuntoInteres(R.string.tituloMonumentoALasCortes, R.string.descripcionMonumentoALasCortes, R.drawable.monumento_a_las_cortes_liberales_description)
    };

    private ListView lsv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdaptadorTitulares adaptador = new AdaptadorTitulares(this, puntosDeInteres);
        lsv = (ListView) findViewById(R.id.lvOpciones);
        lsv.setAdapter(adaptador);

        lsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                int titulo = ((PuntoInteres) a.getItemAtPosition(position)).getTitulo();
                int descripcion = ((PuntoInteres) a.getItemAtPosition(position)).getDescripcion();
                int imagen = ((PuntoInteres) a.getItemAtPosition(position)).getImagen();

                Intent intent = new Intent(MainActivity.this, Informacion.class);
                Bundle bundle = new Bundle();
                bundle.putInt("titulo", titulo);
                bundle.putInt("descripcion", descripcion);
                bundle.putInt("imagen", imagen);
                intent.putExtras(bundle);
                startActivity(intent);



            }
        });

    }
}
