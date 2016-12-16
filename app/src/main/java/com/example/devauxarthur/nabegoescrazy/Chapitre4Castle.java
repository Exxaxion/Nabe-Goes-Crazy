package com.example.devauxarthur.nabegoescrazy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chapitre4Castle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapitre4_castle);

        Button buttonSerrure = (Button) findViewById(R.id.serrure);

        buttonSerrure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(Chapitre4Castle.this, Chapitre4Crocheter.class);
                startActivity(intent);
                finish();
            }
        });
        Button buttonGrimper = (Button) findViewById(R.id.grimper);

        buttonGrimper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(Chapitre4Castle.this, Chapitre4Escalade.class);
                startActivity(intent);
                finish();
            }
        });
        Button buttonIssue = (Button) findViewById(R.id.serrure);

        buttonIssue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(Chapitre4Castle.this, Chapitre4Tour.class);
                startActivity(intent);
                finish();
            }
        });
        Button buttontoc = (Button) findViewById(R.id.idbutton);

        buttontoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent= new Intent(Chapitre4Castle.this, Chapitre4TocToc.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
