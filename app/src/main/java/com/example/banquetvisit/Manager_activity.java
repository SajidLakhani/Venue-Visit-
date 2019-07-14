package com.example.banquetvisit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Manager_activity extends AppCompatActivity {

    TextView t1 , t2 , t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_activity);

        t1 = findViewById(R.id.View1);
        t2 = findViewById(R.id.View2);
        t3 = findViewById(R.id.View3);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                venue();
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                photography();
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catering();
            }
        });

    }

    public void venue (){
        Intent i = new Intent(this , Venue_details.class);
        startActivity(i);
    }

    public void photography (){
        Intent i = new Intent(this , Photographer_details.class);
        startActivity(i);
    }

    public void catering (){
        Intent i = new Intent(this , Caterer_details.class);
        startActivity(i);
    }
}
