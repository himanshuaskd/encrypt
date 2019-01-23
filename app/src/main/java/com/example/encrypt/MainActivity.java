package com.example.encrypt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_pass,et_user;
    String ucheck="mishra";
    String pcheck="123";
    Button bt_login;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_login=findViewById(R.id.bt_login);
        et_user=findViewById(R.id.et_user);
        et_pass= findViewById(R.id.et_pass);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=et_user.getText().toString();
                String pass=et_pass.getText().toString();
                if (user.equals(ucheck) && pass.equals(pcheck))
                {
                    Intent intent =new Intent(MainActivity.this,secondActivity.class);
                    startActivity(intent);
                }
                else
                {
                    count++;
                    String st=(count+"atempt out of 3");
                    Toast.makeText(MainActivity.this, st, Toast.LENGTH_SHORT).show();
                    if (count==3)
                        bt_login.setEnabled(false);
                }
            }
        });

    }
}