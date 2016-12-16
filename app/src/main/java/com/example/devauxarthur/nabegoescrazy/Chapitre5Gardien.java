package com.example.devauxarthur.nabegoescrazy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chapitre5Gardien extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapitre5_gardien);

        Button buttonbagarre = (Button) findViewById(R.id.buttonbaston);

        buttonbagarre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Chapitre5Gardien.this, Chapitre5Bagarre.class);
                startActivity(intent);
                finish();
            }
        });

        Button buttonesquive = (Button) findViewById(R.id.buttonesquive);

        buttonesquive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Chapitre5Gardien.this, Chapitre5Esquive.class);
                startActivity(intent);
                finish();
            }
        });

        Button buttonsacrifice = (Button) findViewById(R.id.buttonsacrifice);

        buttonsacrifice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Chapitre5Gardien.this, Chapitre5Sacrifice.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
