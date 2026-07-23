package com.example.ofuqproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ofuqproject.adapter.AdviceAdapter;
import com.example.ofuqproject.model.AdviceModel;

import java.util.ArrayList;

public class Educational_Consultant extends AppCompatActivity {

    private ListView listViewConsultant;
    private Button btnBackToMain;
    private ArrayList<AdviceModel> adviceArrayList;
    private AdviceAdapter adviceAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_educational_consultant);
        // ربط العناصر مع الـ XML
        listViewConsultant = findViewById(R.id.listViewConsultant);
        btnBackToMain = findViewById(R.id.btnStart);

        // 1. تجهيز قائمة البيانات (النصائح)
        adviceArrayList = new ArrayList<>();

        adviceArrayList.add(new AdviceModel(
                "كيف أتعامل مع غضب طفلي؟",
                "نصائح عملية لاحتواء نوبات الغضب.",
                R.drawable.anger
        ));

        adviceArrayList.add(new AdviceModel(
                "كيف أزيد ثقة طفلي بنفسه؟",
                "طرق بسيطة لتعزيز ثقته بنفسه.",
                R.drawable.trust2
        ));

        adviceArrayList.add(new AdviceModel(
                "كيف أساعده على التعبير؟",
                "شجعه على وصف مشاعره بسهولة.",
                R.drawable.term
        ));

        adviceArrayList.add(new AdviceModel(
                "كيف أهدي طفلي الحزين؟",
                "خطوات فعالة لمساعدته على الهدوء.",
                R.drawable.sad_children
        ));
        // 2. إنشاء الـ Adapter وتمرير البيانات إليه
        adviceAdapter = new AdviceAdapter(this, adviceArrayList);

        // 3. ربط الـ Adapter بالـ ListView
        listViewConsultant.setAdapter(adviceAdapter);

        // 4. الانتقال للشاشة عند النقر على العنصر الأول
        listViewConsultant.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
                if (position == 0) {
                    android.content.Intent intent = new android.content.Intent(Educational_Consultant.this, AngerAdviceActivity.class);
                    startActivity(intent);
                }else if (position == 1) {
                    // الشاشة الثانية: ثقة الطفل بنفسه
                    android.content.Intent intent = new android.content.Intent(Educational_Consultant.this, ConfidenceAdviceActivity.class);
                    startActivity(intent);
                }else if (position == 2) {
                    // الشاشة الثالثة: المساعدة على التعبير
                    android.content.Intent intent = new android.content.Intent(Educational_Consultant.this, ExpressionAdviceActivity.class);
                    startActivity(intent);
                }else if (position == 3) {
                    // الشاشة الرابعة: الطفل الحزين
                    startActivity(new android.content.Intent(Educational_Consultant.this, SadChildAdviceActivity.class));
                }
            }
        });
    }
}



