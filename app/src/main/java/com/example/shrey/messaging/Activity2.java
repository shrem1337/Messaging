package com.example.shrey.messaging;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    private Button b;
    private Button bcompose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        b = findViewById(R.id.button7);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopUp();
            }
        });


        bcompose=findViewById(R.id.button4);
        bcompose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCompose();
            }
        });
}

    public void openPopUp(){
        Intent intent =new Intent(this, Pop.class);
        startActivity(intent);
    }
    public void openCompose(){
        Intent intent =new Intent(this, Activity3.class);
        startActivity(intent);
}
}
