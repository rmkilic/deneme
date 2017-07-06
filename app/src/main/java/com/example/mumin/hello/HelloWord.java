package com.example.mumin.hello;

import android.content.SyncAdapterType;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelloWord extends AppCompatActivity {

    TextView txtMrb;
    Button btnTik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_word);

       txtMrb= (TextView) findViewById(R.id.txtMerhaba);
        btnTik= (Button) findViewById(R.id.btnTikla);


        btnTik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMrb.setText("Tiklandi");
            }
        });


    }



}
