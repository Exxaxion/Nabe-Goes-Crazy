package com.example.devauxarthur.nabegoescrazy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoixTransport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_transport);

        Button buttonRene = (Button) findViewById(R.id.rene);

        buttonRene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(ChoixTransport.this, ChoixTraineau.class);
                startActivity(intent);
                finish();
            }
        });

        Button buttonHelico = (Button) findViewById(R.id.helico);

        buttonHelico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(ChoixTransport.this, ChoixHelico.class);
                startActivity(intent);
                finish();
            }
        });

        Button buttonKenzo = (Button) findViewById(R.id.kenzo);

        buttonKenzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(ChoixTransport.this, ChoixKenzo.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
