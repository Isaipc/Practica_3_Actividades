package com.app.practica_3_actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private EditText et1, et2;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate()");
        setComponents();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

    protected void setComponents()
    {
        et1 = findViewById(R.id.et_num_1);
        et2 = findViewById(R.id.et_num_2);
        tv_result = findViewById(R.id.label_result);
        Button add_button = findViewById(R.id.add_button);
        Button sqr_button = findViewById(R.id.sqr_button);

        tv_result.setText(String.valueOf(0));

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumar();
            }
        });

        sqr_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raiz();
            }
        });
    }

    protected void sumar()
    {
        String str1 = et1.getText().toString();
        String str2 = et2.getText().toString();

        double a = (str1.isEmpty() ? 0  : Double.parseDouble(str1));
        double b = (str2.isEmpty() ? 0  : Double.parseDouble(str2));

        tv_result.setText(String.valueOf(a + b));
    }

    protected void raiz()
    {
        double a = Double.parseDouble(tv_result.getText().toString());

        String sqrt = String.valueOf(Math.sqrt(a));

        Intent intent = new Intent(this, SqrActivity.class);
        Bundle bundle = new Bundle();

        bundle.putString("sqrt", sqrt);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}
