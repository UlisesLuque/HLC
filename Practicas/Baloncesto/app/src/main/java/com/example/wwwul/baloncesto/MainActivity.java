package com.example.wwwul.baloncesto;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button bt1Left;
    private Button bt2Left;
    private Button bt3Left;
    private Button btMoreLeft;
    private Button btLessLeft;
    private Button bt1Right;
    private Button bt2Right;
    private Button bt3Right;
    private Button btMoreRight;
    private Button btLessRight;
    static TextView puntuacionLocal;
    static TextView puntuacionVisitante;
    private TextView btReset;
    static int contadorLocal;
    static int contadorVisitante;
    static TextView nombreEquipo1;
    static   TextView nombreEquipo2;

    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        bt1Left = (Button) findViewById(R.id.bt1Left);
        bt2Left = (Button) findViewById(R.id.bt2Left);
        bt3Left = (Button) findViewById(R.id.bt3Left);
        btLessLeft = (Button) findViewById(R.id.btLessLeft);
        bt1Right = (Button) findViewById(R.id.bt1Right);
        bt2Right = (Button) findViewById(R.id.bt2Right);
        bt3Right = (Button) findViewById(R.id.bt3Right);
        btLessRight = (Button) findViewById(R.id.btLessRight);
        puntuacionLocal = (TextView) findViewById(R.id.tvLeft);
        puntuacionVisitante = (TextView) findViewById(R.id.tvRight);
        btReset = (TextView) findViewById(R.id.btReset);
        nombreEquipo1 = (TextView) findViewById(R.id.tvEquipo1);
        nombreEquipo2 = (TextView) findViewById(R.id.tvEquipo2);


        Intent intent = new Intent(MainActivity.this, Equipos.class);
        startActivity(intent);
    }

    public void resetear(View view){
        dialogoReiniciar dialogoReiniciar = new dialogoReiniciar();
        dialogoReiniciar.show(getFragmentManager(), "Reiniciar");
    }

    public void sumar(View view){
        reproducirSonido( R.raw.basket);
        switch (view.getId()) {
            case R.id.bt1Left:
                contadorLocal += 1;
                break;
            case R.id.bt2Left:
                contadorLocal += 2;
                break;
            case R.id.bt3Left:
                mostrarToastTriple();
                reproducirSonido( R.raw.triple);
                contadorLocal += 3;
                break;
            case R.id.btLessLeft:
                if(contadorLocal > 0)
                    contadorLocal -= 1;
                break;
            case R.id.bt1Right:
                contadorVisitante += 1;
                break;
            case R.id.bt2Right:
                contadorVisitante += 2;
                break;
            case R.id.bt3Right:
                contadorVisitante += 3;
                break;
            case R.id.btLessRight:
                if(contadorVisitante > 0)
                    contadorVisitante -= 1;
                break;
        }
        puntuacionLocal.setText(Integer.toString(contadorLocal));
        puntuacionVisitante.setText(Integer.toString(contadorVisitante));
    }

    private void reproducirSonido(int idSonido) {
        if(mp != null){
            mp.stop();
        }
        mp = MediaPlayer.create(MainActivity.this, idSonido);
        mp.start();
    }

    private void mostrarToastTriple() {
        Context context = getApplicationContext();
        CharSequence message = "Wow!!! TRIPLE!!!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
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
                Intent intentAcerccaDe = new Intent(MainActivity.this, AcercaDe.class);
                startActivity(intentAcerccaDe);
                break;
            case R.id.itemEquipos:
                Intent intentEquipos = new Intent(MainActivity.this, Equipos.class);
                startActivity(intentEquipos);
        }

        return super.onOptionsItemSelected(item);
    }
}

