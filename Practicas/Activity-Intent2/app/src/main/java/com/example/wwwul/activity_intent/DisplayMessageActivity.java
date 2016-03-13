package com.example.wwwul.activity_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

        private TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        tvDisplay = (TextView) findViewById(R.id.tvDisplay);

        Bundle bundle = this.getIntent().getExtras();
        tvDisplay.setText(bundle.getString("MENSAJE"));
    }
}
