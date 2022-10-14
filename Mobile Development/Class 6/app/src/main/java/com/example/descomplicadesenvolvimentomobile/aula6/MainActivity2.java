package com.example.descomplicadesenvolvimentomobile.aula6;

import android.os.Bundle;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

import com.example.descomplicadesenvolvimentomobile.aula6.MainActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent(). getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        Toast.makeText(getApplicationContext(),
                "Values are:\n First value: "+
                        value1+"\n Second value: "+
                        value2, Toast.LENGTH_LONG).show();
    }
    public void callFirstActivity(View view) {
        Intent i = new Intent(getApplicationContext(),
                MainActivity.class);
        startActivity(i);
    }
}