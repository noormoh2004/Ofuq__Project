package com.example.ofuqproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class storis_library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_storis_library);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        ImageView img_arrow =findViewById(R.id.img_arrow);

        img_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent (storis_library.this , choice_screen.class);
                startActivity(i);
            }
        });


        androidx.constraintlayout.widget.ConstraintLayout first_story=findViewById(R.id.first_story);

        first_story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent (storis_library.this , first_story.class);
                startActivity(i);
            }
        });

        androidx.constraintlayout.widget.ConstraintLayout second_story=findViewById(R.id.second_story);

        second_story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent (storis_library.this , second_story.class);
                startActivity(i);
            }
        });



        androidx.constraintlayout.widget.ConstraintLayout third_story=findViewById(R.id.third_story);

        third_story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent (storis_library.this , third_story.class);
                startActivity(i);
            }
        });



        androidx.constraintlayout.widget.ConstraintLayout fourth_story=findViewById(R.id.fourth_story);

        fourth_story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent (storis_library.this , fourth_story.class);
                startActivity(i);
            }
        });




    }
}