package com.company.project.lesson18;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Homework18 {
    public static Map<String, Long> countWords(Collection<String> strings) {
        Map<String, Long> wordCountMap = new HashMap<>();
        for (String str : strings) {
            String[] words = str.split("\\s+"); //разделение слов по 1 или более пробелу

            for (String word : words) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0L) + 1);

            }
        }
        return wordCountMap;
    }

    public static Map<String, Long> frequencyCountWord(String word, String text) {
        Map<String, Long> wordCountMap = new HashMap<>();

        String[] words = text.split("\\s+"); //разделение слов по 1 или более пробелу

        for (String w : words) {
            //приведение слова к нижнему регистру
            w = w.toLowerCase();
            if (w.equals(word.toLowerCase())) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0L) + 1);
            }
        }
        return wordCountMap;
    }

}
