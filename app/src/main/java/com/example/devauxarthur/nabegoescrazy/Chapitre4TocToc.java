package com.example.devauxarthur.nabegoescrazy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chapitre4TocToc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapitre4_toc_toc);

        Button button = (Button) findViewById(R.id.idbuttontoctoc);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Chapitre4TocToc.this, Chapitre5Gardien.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
