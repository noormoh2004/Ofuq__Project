package com.example.ofuqproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class children_login_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_children_login_screen);


        ImageView img_arrow3=findViewById(R.id.img_arrow3);
        img_arrow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(children_login_screen.this , login_screen.class);
                startActivity(i);
            }
        });
        EditText etChildName = findViewById(R.id.et_child_name);
        Button btn_next=findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  قراءة الاسم الذي كتبه الطفل وإزالة الفراغات الزائدة
                String childName = etChildName.getText().toString().trim();

                if (childName.isEmpty()) {
                    Toast.makeText(children_login_screen.this, "الرجاء إدخال اسم الطفل أولاً!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(children_login_screen.this, activity_email_check.class);

                    // إرفاق الاسم مع الانتقال
                    i.putExtra("CHILD_NAME", childName);

                    startActivity(i);
                }
            }
        });
    }
}