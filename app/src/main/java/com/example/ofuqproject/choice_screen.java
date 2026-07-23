package com.example.ofuqproject;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class choice_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_choice_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        ImageView arrow =findViewById(R.id.img_arrow3);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent (choice_screen.this , Home_Page.class);
                startActivity(i);
            }
        });


        LinearLayout stories_Library= findViewById(R.id.stories_Library);

        stories_Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent (choice_screen.this , storis_library.class);
                startActivity(i);
            }
        });

        LinearLayout award=findViewById(R.id.award);

        award.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent (choice_screen.this , Awards_Board.class);
                startActivity(i);
            }
        });



        LinearLayout pazzle=findViewById(R.id.pazzle);
        pazzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent (choice_screen.this , puzzle_screen.class);
                startActivity(i);
            }
        });



    }
}