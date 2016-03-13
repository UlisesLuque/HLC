package example.org.examenulisesluquepaez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etCantidad;
    private TextView tvResultado;
    private Button btUSD;
    private Button btJPY;
    private Button btBGN;
    private Button btCZK;
    private Button btDKK;
    private Button btGBP;
    private Button btHUF;
    private Button btPLN;
    private Button btRON;
    private Button btSEK;
    private Button btCHF;
    private Button btNOK;
    private double cantidad = 0;
    private double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCantidad = (EditText) findViewById(R.id.etCantidad);
        tvResultado  = (TextView) findViewById(R.id.tvResultado);
        btUSD = (Button) findViewById(R.id.btUSD);
        btJPY = (Button) findViewById(R.id.btJPY);
        btBGN = (Button) findViewById(R.id.btBGN);
        btCZK = (Button) findViewById(R.id.btCZK);
        btDKK = (Button) findViewById(R.id.btDKK);
        btGBP = (Button) findViewById(R.id.btGBP);
        btHUF = (Button) findViewById(R.id.btHUF);
        btPLN= (Button) findViewById(R.id.btPLN);
        btRON = (Button) findViewById(R.id.btRON);
        btSEK = (Button) findViewById(R.id.btSEK);
        btCHF = (Button) findViewById(R.id.btCHF);
        btNOK = (Button) findViewById(R.id.btNOK);


        etCantidad.setOnClickListener(this);
        tvResultado.setOnClickListener(this);
        btUSD.setOnClickListener(this);
        btJPY.setOnClickListener(this);
        btBGN.setOnClickListener(this);
        btCZK.setOnClickListener(this);
        btDKK.setOnClickListener(this);
        btGBP.setOnClickListener(this);
        btHUF.setOnClickListener(this);
        btPLN.setOnClickListener(this);
        btRON.setOnClickListener(this);
        btSEK.setOnClickListener(this);
        btCHF.setOnClickListener(this);
        btNOK.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(etCantidad.getText().toString().equals(""))
            cantidad = 0;
        else
            cantidad = Double.parseDouble(etCantidad.getText().toString());
        switch (v.getId()) {
            case R.id.btUSD:
                resultado = cantidad * 1.0943;
                break;
            case R.id.btJPY:
                resultado = cantidad * 132.97;
                break;
            case R.id.btBGN:
                resultado = cantidad * 1.9558;
                break;
            case R.id.btCZK:
                resultado = cantidad * 27.021;
                break;
            case R.id.btDKK:
                resultado = cantidad * 7.4609;
                break;
            case R.id.btGBP:
                resultado = cantidad * 0.72350;
                break;
            case R.id.btHUF:
                resultado = cantidad * 316.61;
                break;
            case R.id.btPLN:
                resultado = cantidad * 4.3389;
                break;
            case R.id.btRON:
                resultado = cantidad * 4.5030;
                break;
            case R.id.btSEK:
                resultado = cantidad * 9.2761;
                break;
            case R.id.btCHF:
                resultado = cantidad * 1.0806;
                break;
            case R.id.btNOK:
                resultado = cantidad * 9.4370;
                break;

        }

        tvResultado.setText(Double.toString(resultado));
    }
}
