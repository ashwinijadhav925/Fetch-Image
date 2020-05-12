package com.example.fetch_image1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Search_Place extends AppCompatActivity {

    private Button btn_place1,btn_place2,btn_place3,btn_place4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search__place);

        btn_place1 = (Button)findViewById(R.id.btn_place1);
        btn_place2 = (Button)findViewById(R.id.btn_place2);
        btn_place3 = (Button)findViewById(R.id.btn_place3);
        btn_place4 = (Button)findViewById(R.id.btn_place4);

        btn_place1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity("Basilica of Bom Jesus");
            }
        });

        btn_place2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity("Fort Aguada");
            }
        });

        btn_place3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity("Calangute Beach");
            }
        });

        btn_place4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity("Church of St. Cajetan");
            }
        });
    }
    public void openActivity(String place){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("place",place);
        startActivity(intent);
    }
}
