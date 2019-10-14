package com.app.practica_3_actividades;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class SqrActivity extends AppCompatActivity {


    TextView sqr_label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqr);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setComponents();
    }

    protected void setComponents()
    {
        sqr_label = findViewById(R.id.sqrt_label);
        sqr_label.setText(getIntent().getStringExtra("sqrt"));

    }

}
