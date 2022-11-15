package com.example.descomplicadesenvolvimentomobile.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button storeinformation = (Button) findViewById(R.id.storeinformation);
        Button showinformation = (Button) findViewById(R.id.showinformation);
        textView = (TextView) findViewById(R.id.txtPrefs);

        View.OnClickListener listener = v -> {
            switch (v.getId()) {
                case R.id.storeinformation:
                    Intent intent = new Intent(MainActivity.this,PrefsActivity.class);
                    startActivity(intent);
                    break;
                case R.id.showinformation:
                    displaySharedPreferences();
                    break;
                default:
                    break;
            }
        };
        storeinformation.setOnClickListener(listener);
        showinformation.setOnClickListener(listener);
    }


    private void displaySharedPreferences() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        String nome = prefs.getString("nome", "Nome");
        String sobrenome = prefs.getString("sobrenome", "Sobrenome");
        String idade = prefs.getString("idade", "Idade");


        StringBuilder builder = new StringBuilder();
        builder.append("Nome: " + nome + "\n");
        builder.append("Sobrenome: " + sobrenome + "\n");
        builder.append("Idade: " + idade + "\n");
        textView.setText(builder.toString());

    }

}