package com.example.quytrinhthietke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtNoiDung; // pham vi toan cuc
    Button btnClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // anh xa

        txtNoiDung = (TextView) findViewById(R.id.textViewNoiDung);
        btnClick = (Button) findViewById(R.id.buttonClick);
        // viet code


        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNoiDung.setText("Lap trinh android");
            }
        });

    }
}