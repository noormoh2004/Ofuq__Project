package com.example.ofuqproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AngerAdviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_anger_advice);

    // ربط زر العودة وبرمجته لإغلاق الشاشة والرجوع للقائمة
        Button btnBack = findViewById(R.id.btn_next);
        btnBack.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(AngerAdviceActivity.this , Educational_Consultant.class);
            startActivity(i);
        }
    });
    }
}
