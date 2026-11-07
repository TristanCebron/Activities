
package com.example.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int stevec = 0;
    TextView prikaz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prikaz = findViewById(R.id.textView);

        stevec = getIntent().getIntExtra("stevec", 0);

        if (savedInstanceState != null) {
            stevec = savedInstanceState.getInt("stevec");
        }

        prikaz.setText("" + stevec);

        findViewById(R.id.count).setOnClickListener(v -> {
            stevec++;
            prikaz.setText("" + stevec);
        });

        findViewById(R.id.b_activity2).setOnClickListener(v -> {
            Intent intent = new Intent(this, HelloActivity.class);
            intent.putExtra("stevec", stevec);
            startActivity(intent);
        });

        findViewById(R.id.b_activity3).setOnClickListener(v -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            intent.putExtra("stevec", stevec);
            startActivity(intent);
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        stevec = intent.getIntExtra("stevec", stevec);
        prikaz.setText("" + stevec);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("stevec", stevec);
        super.onSaveInstanceState(outState);
    }
}
