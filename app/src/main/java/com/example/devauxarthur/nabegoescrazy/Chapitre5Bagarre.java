package com.example.devauxarthur.nabegoescrazy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chapitre5Bagarre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapitre5_bagarre);

        Button buttonbag = (Button) findViewById(R.id.idbutton);

        buttonbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Chapitre5Bagarre.this, Chapitre5Gardien.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
