package com.chatmouse.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class InicioActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        toolbar=(Toolbar) findViewById(R.id.toolbar_app_principal);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ChatMouse");
    }
}