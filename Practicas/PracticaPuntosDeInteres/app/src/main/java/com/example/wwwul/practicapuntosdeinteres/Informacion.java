package com.example.wwwul.practicapuntosdeinteres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Informacion extends AppCompatActivity {

    private ImageView ivImagen;
    private TextView tvTitulo;
    private TextView tvDescricion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_informacion);

        ivImagen = (ImageView) findViewById(R.id.ivImagen);
        tvTitulo = (TextView) findViewById(R.id.tvTitulo);
        tvDescricion = (TextView) findViewById(R.id.tvDescripcion);

        Bundle bundle = this.getIntent().getExtras();
        tvTitulo.setText(bundle.getInt("titulo"));
        tvDescricion.setText(bundle.getInt("descripcion"));
        ivImagen.setImageResource(conprobarImagen(bundle.getInt("imagen")));
    }

    private int conprobarImagen(int idImagen) {
        int imagen = 0;
        switch (idImagen){
            case R.drawable.mezquita_description:
                imagen = R.drawable.mezquita;
                break;
            case R.drawable.alcazar_description:
                imagen = R.drawable.alcazar;
                break;
            case R.drawable.alcazaba_description:
                imagen = R.drawable.alcazaba;
                break;
            case R.drawable.alhambra_description:
                imagen = R.drawable.alhambra;
                break;
            case R.drawable.monumento_a_las_cortes_liberales_description:
                imagen = R.drawable.monumento_a_las_cortes_liberales;
                break;
            case R.drawable.torre_del_oro_description:
                imagen = R.drawable.torre_del_oro;
                break;
        }
        return imagen;
    }
}
