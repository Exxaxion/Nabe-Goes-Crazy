package com.example.devauxarthur.nabegoescrazy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chapitre5Sacrifice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapitre5_sacrifice);

        Button button = (Button) findViewById(R.id.idbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Chapitre5Sacrifice.this, Chapitre6Boss.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
