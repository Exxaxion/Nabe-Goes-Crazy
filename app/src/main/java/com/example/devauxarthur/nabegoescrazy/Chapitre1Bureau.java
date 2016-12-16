package com.example.devauxarthur.nabegoescrazy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class Chapitre1Bureau extends AppCompatActivity {
    private HashMap proute = new HashMap();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapitre1_bureau);


       /* if(countIndice1 = getIntent().getExtras().getBoolean("countIndice1")){
            countIndice1 = getIntent().getExtras().getBoolean("countIndice1");
        }
        if(countIndice2 = getIntent().getExtras().getBoolean("countIndice2")){
            countIndice3 = getIntent().getExtras().getBoolean("countIndice1");
        }
        if(countIndice3 = getIntent().getExtras().getBoolean("countIndice3")){
            countIndice3 = getIntent().getExtras().getBoolean("countIndice1");
        }*/


        Button buttonIndice1 = (Button) findViewById(R.id.indice1);

        buttonIndice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Chapitre1Bureau.this, Indice1.class);
                startActivity(intent);
            }
        });

        Button buttonIndice2 = (Button) findViewById(R.id.indice2);

        buttonIndice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Chapitre1Bureau.this, Indice2.class);
                startActivity(intent);
            }
        });

        Button buttonIndice3 = (Button) findViewById(R.id.indice3);

        buttonIndice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Chapitre1Bureau.this, Indice3.class);
                startActivity(intent);
            }
        });

        Button buttonIndiceSuite = (Button) findViewById(R.id.indicesuite);

        buttonIndiceSuite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapitre1Bureau.this, ConclusionLieu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
