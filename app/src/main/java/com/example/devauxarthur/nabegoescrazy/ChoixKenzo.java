package com.example.devauxarthur.nabegoescrazy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoixKenzo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_kenzo);

        Button buttonRene = (Button) findViewById(R.id.idbutton);

        buttonRene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(ChoixKenzo.this, Chapitre3Trajet.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
