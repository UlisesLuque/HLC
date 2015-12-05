package example.org.operarnumeros;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResultado;
    private EditText etNumero1;
    private EditText etNumero2;
    private Button botonSumar;
    private Button botonRestar;
    private Button botonMultiplicar;
    private Button botonDividir;
    private int numero1;
    private int numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        tvResultado = (TextView) findViewById(R.id.tvResultado);
        etNumero1 = (EditText) findViewById(R.id.etNumero1);
        etNumero2 = (EditText) findViewById(R.id.etNumero2);
        botonSumar = (Button) findViewById(R.id.botonSumar);
        botonRestar = (Button) findViewById(R.id.botonRestar);
        botonMultiplicar = (Button) findViewById(R.id.botonMultiplicar);
        botonDividir = (Button) findViewById(R.id.botonDividir);


        botonSumar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numero1 = Integer.parseInt(etNumero1.getText().toString());
                numero2 = Integer.parseInt(etNumero2.getText().toString());
                tvResultado.setText("Resultado: " + sumar(numero1, numero2));
            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numero1 = Integer.parseInt(etNumero1.getText().toString());
                numero2 = Integer.parseInt(etNumero2.getText().toString());
                tvResultado.setText("Resultado: " + restar(numero1, numero2));
            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numero1 = Integer.parseInt(etNumero1.getText().toString());
                numero2 = Integer.parseInt(etNumero2.getText().toString());
                tvResultado.setText("Resultado: " + multiplicar(numero1, numero2));
            }
        });

        botonDividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numero1 = Integer.parseInt(etNumero1.getText().toString());
                numero2 = Integer.parseInt(etNumero2.getText().toString());
                tvResultado.setText("Resultado: " + dividir(numero1, numero2));
            }
        });
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Suma dos números
     * @param numero1
     * @param numero2
     * @return devuelve el resultado de tipo int
     */
    private int sumar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
    }

    /**
     * Resta dos números
     * @param numero1
     * @param numero2
     * @return devuelve el resultado de tipo int
     */
    private int restar(int numero1, int numero2) {
        int resultado = numero1 - numero2;
        return resultado;
    }

    /**
     * Multiplica dos números
     * @param numero1
     * @param numero2
     * @return devuelve el resultado de tipo int
     */
    private int multiplicar(int numero1, int numero2) {
        int resultado = numero1 * numero2;
        return resultado;
    }

    /**
     * Divide dos números
     * @param numero1
     * @param numero2
     * @return devuelve el resultado de tipo int
     */
    private int dividir(int numero1, int numero2) {
        int resultado = numero1 / numero2;
        return resultado;
    }
}
