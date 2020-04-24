package com.coronavirus.world.cases.databaseapplicaiton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    Button one,two,three,four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHandler dbHandler = new DBHandler(getApplicationContext(),"UserData",null,1);
        Temp.setDbHandler(dbHandler);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.Two);
        three = (Button)findViewById(R.id.Three);
        four = (Button)findViewById(R.id.Four);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(MainActivity.this, InsertUser.class));
                finish();

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });







    }
}
