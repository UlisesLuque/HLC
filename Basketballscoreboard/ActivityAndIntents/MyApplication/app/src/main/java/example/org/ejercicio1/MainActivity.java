package example.org.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button boton = (Button) findViewById(R.id.button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
                Bundle b = new Bundle();
                b.putString("MENSAJE", editText.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
