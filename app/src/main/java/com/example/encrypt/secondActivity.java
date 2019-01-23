package com.example.encrypt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class secondActivity extends AppCompatActivity {
    EditText et_text;
    Button bt_encrypt,bt_decrypt;
    TextView tv_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_text=findViewById(R.id.et_text);
        tv_view=findViewById(R.id.tv_view);
        bt_decrypt=findViewById(R.id.bt_decrypt);
        bt_encrypt=findViewById(R.id.bt_encrypt);

        bt_encrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] st=et_text.getText().toString().split("");
                Random rand =new Random();
                String prnt="";
                for (int i=0;i<st.length;i++)
                {
                    prnt+=st[i]+rand.nextInt(100);
                }
                tv_view.setText(prnt);
            }
        });

        bt_decrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st=tv_view.getText().toString();
                st=st.replaceAll("[0-9]","");
                tv_view.setText(st);
            }
        });
    }
}
