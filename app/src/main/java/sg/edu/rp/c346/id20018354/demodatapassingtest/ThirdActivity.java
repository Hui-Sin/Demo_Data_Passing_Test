package sg.edu.rp.c346.id20018354.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tvAnswer2 = findViewById(R.id.textViewCharAns);
        Intent intentReceived = getIntent();
        char charactervalue = intentReceived.getCharExtra("char", 'x');
        tvAnswer2.setText("Character value received is: " + charactervalue);
    }
}