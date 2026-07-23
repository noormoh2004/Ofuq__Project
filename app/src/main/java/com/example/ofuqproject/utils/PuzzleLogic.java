package com.example.ofuqproject.utils;

import java.util.ArrayList;
import java.util.List;
import com.example.ofuqproject.model.Puzzle;

public class PuzzleLogic {
    public static boolean checkAnswer(String userInput, String solution) {
        return userInput.trim().equalsIgnoreCase(solution);
    }

    public static List<Puzzle> getPuzzleList() {
        List<Puzzle> puzzles = new ArrayList<>();

        puzzles.add(new Puzzle("لي أسنان كثيرة لكنني لا أعض أبداً، فأنا أرتب شعركِ الجميل، فمن أنا؟", "المشط", "يستخدم لتسريح الشعر"));
        puzzles.add(new Puzzle("أنا فاكهة صفراء ولذيذة، شكلي يشبه الهلال، ويحبني القرد كثيراً.. فمن أنا؟", "الموز", "يحبه القرد كثيراً"));
        puzzles.add(new Puzzle("لدي أذنان طويلتان، وأحب أكل الجزر كثيراً، فمن أنا؟", "الأرنب", "حيوان لطيف وسريع"));
        puzzles.add(new Puzzle("أخرج في النهار لأضيء الكون، وأختفي في الليل لأنام، فمن أنا؟", "الشمس", "تظهر نهاراً وتختفي ليلاً"));
        puzzles.add(new Puzzle("شيء له وجه ولا يتكلم، وله يدان ولا يصفق؟", "الساعة", "تخبرنا بالوقت"));

        return puzzles;
    }
}