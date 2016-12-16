package com.example.devauxarthur.nabegoescrazy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chapitre4Escalade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapitre4_escalade);

        Button button = (Button) findViewById(R.id.idbuttonscale);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Chapitre4Escalade.this, Chapitre4Castle.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
