package com.example.descomplicadesenvolvimentomobile.aula10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button send;

    EditText phone_number, message;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        send = (Button)findViewById(R.id.Send_msg_btn);
        phone_number = (EditText)findViewById(R.id.phoneNumber);
        message = (EditText)findViewById(R.id.MainActivity_message);
        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String phone_Num = phone_number.getText().toString();
        String send_msg = message.getText().toString();
        try {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(phone_Num,null, send_msg,null, null);
        } catch (Exception e) {
            Toast.makeText(this, "Sms não Enviado", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}