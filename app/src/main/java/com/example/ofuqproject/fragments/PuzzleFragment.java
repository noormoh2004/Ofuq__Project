package com.example.ofuqproject.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ofuqproject.Puzzle_win_screen;
import com.example.ofuqproject.R;
import com.example.ofuqproject.model.Puzzle;
import com.example.ofuqproject.utils.PuzzleLogic;
import java.util.List;
public class PuzzleFragment extends Fragment {
    private List<Puzzle> puzzleList;
    private int currentPuzzleIndex = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_puzzle, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // 1. ربط جميع العناصر بما في ذلك المربعات الجديدة
        TextView tvQuestion = view.findViewById(R.id.tv_puzzle_question);
        EditText etAnswer = view.findViewById(R.id.et_answer);
        Button btnCheck = view.findViewById(R.id.btn_check);
        TextView tvHintDisplay = view.findViewById(R.id.tv_hint_display);
        Button btnHint = view.findViewById(R.id.btn_hint);
        Button btnNext = view.findViewById(R.id.btn_next); // تعريف الزر الجديد

        // ربط المربعات الجديدة
        LinearLayout errorBox = view.findViewById(R.id.ll_error_message);
        LinearLayout successBox = view.findViewById(R.id.ll_success_message);

        puzzleList = PuzzleLogic.getPuzzleList();
        tvQuestion.setText(puzzleList.get(currentPuzzleIndex).getQuestion());

        btnHint.setOnClickListener(v -> {
            // جلب التلميح
            String hint = puzzleList.get(currentPuzzleIndex).getHint();

            // هنا نقول للزر: "عندما يضغط المستخدم عليك، اذهب لمربع النص (tvHintDisplay) وضع فيه هذا التلميح"
            tvHintDisplay.setText("تلميح: " + hint);
        });

        btnCheck.setOnClickListener(v -> {
            String userAnswer = etAnswer.getText().toString();
            String correctAnswer = puzzleList.get(currentPuzzleIndex).getAnswer();

            if (PuzzleLogic.checkAnswer(userAnswer, correctAnswer)) {
                errorBox.setVisibility(View.GONE);
                successBox.setVisibility(View.VISIBLE);

                // إخفاء زر التحقق وإظهار زر التالي
                btnCheck.setVisibility(View.GONE);
                btnNext.setVisibility(View.VISIBLE);
            } else {
                successBox.setVisibility(View.GONE);
                errorBox.setVisibility(View.VISIBLE);
            }
        });

// برمجة زر التالي
        btnNext.setOnClickListener(v -> {
            currentPuzzleIndex++;
            if (currentPuzzleIndex < puzzleList.size()) {
                tvQuestion.setText(puzzleList.get(currentPuzzleIndex).getQuestion());
                etAnswer.setText("");
                successBox.setVisibility(View.GONE);
                tvHintDisplay.setText(""); // مسح التلميح

                // إعادة إظهار زر التحقق وإخفاء زر التالي
                btnNext.setVisibility(View.GONE);
                btnCheck.setVisibility(View.VISIBLE);
             } else {
            // الانتقال فوراً إلى شاشة الفوز وحفظ الـ Intent
            android.content.Intent intent = new android.content.Intent(requireContext(), Puzzle_win_screen.class);
            startActivity(intent);

            // إغلاق الفراج الحالي أو النشاط إن أردتِ حتى لا يتم الرجوع إليه عند الضغط على زر العودة
            requireActivity().finish();
        }
        });
    }
}

