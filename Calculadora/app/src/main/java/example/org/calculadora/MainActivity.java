package example.org.calculadora;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button modulo;
    private Button raiz;
    private Button cuadrado;
    private Button equis;
    private Button ce;
    private Button c;
    private Button retroceso;
    private Button dividir;
    private Button siete;
    private Button ocho;
    private Button nueve;
    private Button por;
    private Button cuatro;
    private Button cinco;
    private Button seis;
    private Button menos;
    private Button uno;
    private Button dos;
    private Button tres;
    private Button mas;
    private Button posneg;
    private Button cero;
    private Button coma;
    private Button igual;
    private TextView tvPantalla;

    private String numero1 = "";
    private String numero2 = "";
    private String resultado = "";
    private String operacion= "";
    private boolean mostrar = true;
    private int operar = 0;
    private boolean perOperar = true;


    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        modulo = (Button) findViewById(R.id.buttonModulo);
        raiz = (Button) findViewById(R.id.buttonRaiz);
        cuadrado = (Button) findViewById(R.id.buttonCuadrado);
        equis = (Button) findViewById(R.id.buttonX);
        ce = (Button) findViewById(R.id.buttonCE);
        c = (Button) findViewById(R.id.buttonC);
        retroceso = (Button) findViewById(R.id.buttonRetroceso);
        dividir = (Button) findViewById(R.id.buttonDividir);
        siete = (Button) findViewById(R.id.button7);
        ocho = (Button) findViewById(R.id.button8);
        nueve = (Button) findViewById(R.id.button9);
        por = (Button) findViewById(R.id.buttonMultiplicar);
        cuatro = (Button) findViewById(R.id.button4);
        cinco = (Button) findViewById(R.id.button5);
        seis = (Button) findViewById(R.id.button6);
        menos = (Button) findViewById(R.id.buttonMenos);
        uno = (Button) findViewById(R.id.button1);
        dos = (Button) findViewById(R.id.button2);
        tres = (Button) findViewById(R.id.button3);
        mas = (Button) findViewById(R.id.buttonMas);
        posneg = (Button) findViewById(R.id.buttonPosNeg);
        cero = (Button) findViewById(R.id.button0);
        coma = (Button) findViewById(R.id.buttonComa);
        igual = (Button) findViewById(R.id.buttonIgual);
        tvPantalla = (TextView) findViewById(R.id.tvPatalla);

        modulo.setOnClickListener(this);
        raiz.setOnClickListener(this);
        cuadrado.setOnClickListener(this);
        equis.setOnClickListener(this);
        ce.setOnClickListener(this);
        c.setOnClickListener(this);
        retroceso.setOnClickListener(this);
        dividir.setOnClickListener(this);
        siete.setOnClickListener(this);;
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        por.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        menos.setOnClickListener(this);
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        mas.setOnClickListener(this);
        posneg.setOnClickListener(this);
        cero.setOnClickListener(this);
        coma.setOnClickListener(this);
        igual.setOnClickListener(this);
        tvPantalla.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        String numero = "";
        switch (view.getId()) {
            case R.id.button0:
                numero = "0";
                perOperar = true;
                break;
            case R.id.button1:
                numero = "1";
                perOperar = true;
                break;
            case R.id.button2:
                numero = "2";
                perOperar = true;
                break;
            case R.id.button3:
                numero = "3";
                perOperar = true;
                break;
            case R.id.button4:
                numero = "4";
                perOperar = true;
                break;
            case R.id.button5:
                numero = "5";
                perOperar = true;
                break;
            case R.id.button6:
                numero = "6";
                perOperar = true;
                break;
            case R.id.button7:
                numero = "7";
                perOperar = true;
                break;
            case R.id.button8:
                numero = "8";
                perOperar = true;
                break;
            case R.id.button9:
                numero = "9";
                perOperar = true;
                break;
            case R.id.buttonComa:
                numero = ".";
                break;
            case R.id.buttonCE:
                numero1 = "";
                numero2 = "";
                resultado = "";
                operar = 0;
                break;
            case R.id.buttonC:
                operacion = "c";
                if(operar == 0)
                    numero1 = "";
                else
                    numero2 = "";
                break;
            case R.id.buttonRetroceso:
                if(operar == 0)
                    if(numero1.length() != 0)
                        numero1 = numero1.substring(0, numero1.length()-1);
                else
                    if(numero2.length() != 0)
                        numero2 = numero2.substring(0, numero2.length()-1);
                break;
            case R.id.buttonDividir:
                if(perOperar){
                    operacion = "dividir";
                    operar++;
                    if(!mostrar)
                        mostrar = true;
                    perOperar = false;
                }
                break;
            case R.id.buttonMultiplicar:
                if(perOperar){
                    operacion = "multiplicar";
                    operar++;
                    if(!mostrar)
                        mostrar = true;
                    perOperar = false;
                }
                break;
            case R.id.buttonMenos:
                if (perOperar) {
                    operacion = "restar";
                    operar++;
                    if(!mostrar)
                        mostrar = true;
                    perOperar = false;
                }
                break;
            case R.id.buttonMas:
                if(perOperar){
                    operacion = "sumar";
                    operar++;
                    if(!mostrar)
                        mostrar = true;
                    perOperar = false;
                }
                break;
            case R.id.buttonIgual:
                if(operar > 0 && numero2 != ""){
                    operar();
                    if(resultado.substring(resultado.length()-2).equals(".0"))
                        resultado = resultado.substring(0, resultado.length()-2);
                    operar = 0;
                    numero1 =resultado;
                    numero2 = "";
                    tvPantalla.setText(resultado);
                    return;
                }
                break;
            case R.id.buttonPosNeg:
                operacion = "cambiar";
                if(operar == 0)
                    numero1 = "-" + numero1;
                else
                    numero2 = "-" + numero2;
                break;

            case R.id.buttonCuadrado:
                if(operar == 0)
                    numero1 = Double.toString(Math.pow(Double.parseDouble(numero1), 2));
                else {
                    resultado = Double.toString(Math.pow(Double.parseDouble(resultado), 2));
                    tvPantalla.setText(resultado);
                    return;
                }
                break;
            case R.id.buttonRaiz:
                if(operar == 0)
                    numero1 = Double.toString(Math.sqrt(Double.parseDouble(numero1)));
                else {
                    resultado = Double.toString(Math.sqrt(Double.parseDouble(resultado)));
                    tvPantalla.setText(resultado);
                    return;
                }
                break;
            case R.id.buttonModulo:
                if(perOperar){
                    operacion = "modulo";
                    operar++;
                    if(!mostrar)
                        mostrar = true;
                    perOperar = false;
                }
                break;
            case R.id.buttonX:
                if(operar == 0)
                    numero1 = Double.toString(1/(Double.parseDouble(numero1)));
                else {
                    resultado = Double.toString(1/(Double.parseDouble(resultado)));
                    tvPantalla.setText(resultado);
                    return;
                }
                break;
        }

        if(operar == 0){
            numero1 += numero;
            tvPantalla.setText(numero1);
        }else if (operar == 1){
            numero2 += numero;
            tvPantalla.setText(numero2);
        } else if (operar > 1){
            if(mostrar){
                operar();
                if(resultado.substring(resultado.length()-2).equals(".0"))
                    resultado = resultado.substring(0, resultado.length()-2);
                numero1 = resultado;
                numero2 = "";
                tvPantalla.setText(resultado);
                mostrar = false;
            }else {
                numero2 += numero;
                tvPantalla.setText(numero2);
            }
        }

    }

    public void operar(){
        switch (operacion){
            case "dividir":
                resultado = Double.toString(Double.parseDouble(numero1) / Double.parseDouble(numero2));
                break;
            case "multiplicar":
                resultado = Double.toString(Double.parseDouble(numero1) * Double.parseDouble(numero2));
                break;
            case "sumar":
                resultado =  Double.toString(Double.parseDouble(numero1) + Double.parseDouble(numero2));
                break;
            case "restar":
                resultado =  Double.toString(Double.parseDouble(numero1) - Double.parseDouble(numero2));
                break;
            case "modulo":
                resultado = Double.toString(Double.parseDouble(numero1) % Double.parseDouble(numero2));
        }
    }
}
