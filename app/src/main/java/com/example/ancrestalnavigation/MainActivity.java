package com.example.ancrestalnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgDonut;
    ImageView imgIceCream;
    ImageView imgFroyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDonut = findViewById(R.id.donut);
        imgIceCream = findViewById(R.id.ice_cream);
        imgFroyo = findViewById(R.id.froyo);

        imgDonut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, DonutActivity.class);
                startActivity(intent);
            }
        });

        imgIceCream.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, IceCreamActivity.class);
                startActivity(intent);
            }
        });

        imgFroyo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, FroyoActivity.class);
                startActivity(intent);
            }
        });

    }
}