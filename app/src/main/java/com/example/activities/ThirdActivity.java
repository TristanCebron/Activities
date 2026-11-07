
package com.example.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    int stevec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        stevec = getIntent().getIntExtra("stevec", 0);

        TextView prikaz = findViewById(R.id.textView4);
        prikaz.setText("" + stevec);

        findViewById(R.id.b_activity1).setOnClickListener(v -> {
            odpriPrvo();
        });

        findViewById(R.id.b_activity4).setOnClickListener(v -> {
            odpriDrugo();
        });

        findViewById(R.id.main).setOnTouchListener(
                new OnSwipeTouchListener(this) {

                    @Override
                    public void onSwipeLeft() {
                        odpriPrvo();
                    }

                    @Override
                    public void onSwipeRight() {
                        odpriDrugo();
                    }
                }
        );
    }

    public void odpriPrvo() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("stevec", stevec);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    public void odpriDrugo() {
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra("stevec", stevec);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}
