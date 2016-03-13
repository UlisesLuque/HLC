package com.example.wwwul.practicalistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView lstOpciones;

    private TextView lblEtiqueta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Titular[] datos = new Titular[]{
            new Titular("Título 1", "Subtítulo largo 1"),
            new Titular("Título 2", "Subtítulo largo 2"),
            new Titular("Título 3", "Subtítulo largo 3"),
            new Titular("Título 4", "Subtítulo largo 4")};

        AdaptadorTitulares adaptador = new AdaptadorTitulares(this, datos);

        lstOpciones = (ListView) findViewById(R.id.lstOpciones);

        lblEtiqueta = (TextView) findViewById(R.id.lblEtiqueta);

        lstOpciones.setAdapter(adaptador);

        View header = getLayoutInflater().inflate(R.layout.list_header, null);
        lstOpciones.addHeaderView(header);

        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                //Alternativa 1:
                String opcionSeleccionada =
                        ((Titular) a.getItemAtPosition(position)).getTitulo();

                //Alternativa 2:
                //String opcionSeleccionada =
                //      ((TextView)v.findViewById(R.id.LblTitulo))
                //          .getText().toString();

                lblEtiqueta.setText("Opción seleccionada: " + opcionSeleccionada);
            }
        });
    }
}
