package example.org.basketballscoreboard;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Ulises on 31/10/2015.
 */
public class Contador extends Activity {

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
    private TextView tvLeft;
    private TextView tvRight;
    private TextView btReset;
    private int contadorLeft;
    private int contadorRight;
    private TextView nombreEquipo1;
    private  TextView nombreEquipo2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contador);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        bt1Left = (Button) findViewById(R.id.bt1Left);
        bt2Left = (Button) findViewById(R.id.bt2Left);
        bt3Left = (Button) findViewById(R.id.bt3Left);
        btLessLeft = (Button) findViewById(R.id.btLessLeft);
        bt1Right = (Button) findViewById(R.id.bt1Right);
        bt2Right = (Button) findViewById(R.id.bt2Right);
        bt3Right = (Button) findViewById(R.id.bt3Right);
        btLessRight = (Button) findViewById(R.id.btLessRight);
        tvLeft = (TextView) findViewById(R.id.tvLeft);
        tvRight = (TextView) findViewById(R.id.tvRight);
        btReset = (TextView) findViewById(R.id.btReset);
        nombreEquipo1 = (TextView) findViewById(R.id.tvEquipo1);
        nombreEquipo2 = (TextView) findViewById(R.id.tvEquipo2);

        Bundle bundle = this.getIntent().getExtras();
        nombreEquipo1.setText(bundle.getString("nombreEquipo1"));
        nombreEquipo2.setText(bundle.getString("nombreEquipo2"));

    }

    public void resetear(View view){
        contadorLeft = 0;
        contadorRight = 0;
        tvLeft.setText(Integer.toString(contadorLeft));
        tvRight.setText(Integer.toString(contadorRight));
    }

    public void sumar(View view){
        switch (view.getId()) {
            case R.id.bt1Left:
                contadorLeft += 1;
                break;
            case R.id.bt2Left:
                contadorLeft += 2;
                break;
            case R.id.bt3Left:
                contadorLeft += 3;
                break;
            case R.id.btLessLeft:
                if(contadorLeft > 0)
                    contadorLeft -= 1;
                break;
            case R.id.bt1Right:
                contadorRight += 1;
                break;
            case R.id.bt2Right:
                contadorRight += 2;
                break;
            case R.id.bt3Right:
                contadorRight += 3;
                break;
            case R.id.btLessRight:
                if(contadorRight > 0)
                    contadorRight -= 1;
                break;
        }
        tvLeft.setText(Integer.toString(contadorLeft));
        tvRight.setText(Integer.toString(contadorRight));
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
}