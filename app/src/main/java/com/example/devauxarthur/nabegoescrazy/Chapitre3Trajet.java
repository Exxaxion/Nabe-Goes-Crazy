package com.example.devauxarthur.nabegoescrazy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chapitre3Trajet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapitre3_trajet);

        Button buttonRene = (Button) findViewById(R.id.idbutton);

        buttonRene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(Chapitre3Trajet.this, Chapitre4Castle.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
