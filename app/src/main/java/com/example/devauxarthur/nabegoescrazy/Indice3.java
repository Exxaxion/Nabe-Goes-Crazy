package com.example.devauxarthur.nabegoescrazy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Indice3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indice3);

        Button button = (Button) findViewById(R.id.idbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StoreSingleton.getInstance().setCountIndice3(true);


                Intent intent= new Intent(Indice3.this, Chapitre1Bureau.class);
                //intent.putExtra("countIndice3", true);
                startActivity(intent);
                finish();

            }
        });
    }
}
