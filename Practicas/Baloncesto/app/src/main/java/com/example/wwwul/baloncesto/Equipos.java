package com.example.wwwul.baloncesto;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Equipos extends AppCompatActivity {

    private TextView etEquipo1;
    private TextView etEquipo2;
    private Button btGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);



        etEquipo1 = (TextView) findViewById(R.id.etEquipo1);
        etEquipo2 = (TextView) findViewById(R.id.etEquipo2);
        btGuardar = (Button) findViewById(R.id.btGuardar);

        etEquipo1.setText(MainActivity.nombreEquipo1.getText().toString());
        etEquipo2.setText(MainActivity.nombreEquipo2.getText().toString());

        btGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recogerDatos();
            }
        });


    }

    private void recogerDatos(){
        MainActivity.nombreEquipo1.setText(etEquipo1.getText().toString());
        MainActivity.nombreEquipo2.setText(etEquipo2.getText().toString());
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        switch (id){
            case R.id.itemAcercaDe:
                Intent intentAcerccaDe = new Intent(Equipos.this, AcercaDe.class);
                startActivity(intentAcerccaDe);
                break;
            case R.id.itemContador:
                finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
