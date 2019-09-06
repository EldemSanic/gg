package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.InvalidPropertiesFormatException;

public class MainActivity extends AppCompatActivity {
    Button button;

    TextView TextView1;
    EditText EditText1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        TextView1 = findViewById(R.id.textView1);
        EditText1 = findViewById(R.id.editText1);

        button.setOnClickListener(new View.OnClickListener() {@Override
            public void onClick(View view) {
                readText();
                Toast.makeText(MainActivity.this, "Стаз", Toast.LENGTH_LONG).show();
            }

        });

    }

    void readText() {
        String text = EditText1.getText().toString();
        TextView1.setText(text + "- OK");

    }

}


