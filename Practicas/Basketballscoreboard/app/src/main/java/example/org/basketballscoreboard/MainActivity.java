package example.org.basketballscoreboard;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView etEquipo1;
    private TextView etEquipo2;
    private Button btGuardar;


    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        etEquipo1 = (TextView) findViewById(R.id.etEquipo1);
        etEquipo2 = (TextView) findViewById(R.id.etEquipo2);
        btGuardar = (Button) findViewById(R.id.btGuardar);

        btGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recogerDatos();
            }
        });

    }



    private void recogerDatos(){
        Intent intent = new Intent(MainActivity.this, Contador.class);
        Bundle bundle = new Bundle();
        bundle.putString("nombreEquipo1", etEquipo1.getText().toString());
        bundle.putString("nombreEquipo2", etEquipo2.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
