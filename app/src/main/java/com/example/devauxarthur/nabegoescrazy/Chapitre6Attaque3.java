package com.example.devauxarthur.nabegoescrazy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chapitre6Attaque3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapitre6_attaque3);

        Button button = (Button) findViewById(R.id.idbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Chapitre6Attaque3.this, Chapitre6RomainAttaque.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
