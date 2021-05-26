package com.example.whatsappsend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText phoneNumber;
    EditText countryCode;
    Button chatWithMe;
    TextView showNumber;
    String phoneNumberVal;
    String countryCodeVal;
    StringBuilder _sb;

    {
        _sb = new StringBuilder("65");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNumber = (EditText) findViewById(R.id.editTextPhone);
        chatWithMe = (Button) findViewById(R.id.chatWithMe);
        showNumber = (TextView) findViewById(R.id.displayName);
        countryCode = (EditText) findViewById(R.id.countryCode);


        chatWithMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNumberVal = phoneNumber.getText().toString();
                if(countryCode != null) {
                    countryCodeVal = countryCode.getText().toString();
                    showNumber.setText("wa.me/" + countryCodeVal + phoneNumberVal);
                }
                else {
                    showNumber.setText("wa.me/65" + phoneNumberVal);
                }
            }
        });
    }

    private void ShowToast(String text){
        Toast.makeText(MainActivity.this,text,Toast.LENGTH_LONG).show();
    }
}