package io_61_Aleshchenko;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab3 {
    public static void main(String[] args) {

//        В усіх питальних реченнях заданого тексту знайти та надрукувати без повторень слова заданої довжини.
//        Якщо таких слів немає, то вивести відповідне повідомлення.

        /*String text = "В усіх питальних реченнях заданого тексту знайти та надрукувати без повторень слова заданої довжини. Якщо таких слів немає, то вивести відповідне повідомлення.";
        String[] sentences = text.split("[.!?]");
        int wordLength = 5;

        for (String sentence : sentences) {
            String[] words = sentence.split("[\\s,;:.!?]+");
            for (String word : words) {
                if (word.length() == wordLength) {
                    System.out.println(word);
                }
            }
        }*/

//        StringBuilder stringBuilder = new StringBuilder("Мій текст");
        /*StringBuilder stringBuilder = new StringBuilder("My text hell");
//        stringBuilder.toString().matches("\\b[^ ]{2}\\b", )
//        Pattern.matches()
        int wordLength = 4;

//        Pattern pattern = Pattern.compile("\\b\\w{" + wordLength + "}\\b");
        Pattern pattern = Pattern.compile("\\b[^ ]{" + wordLength + "}\\b");

        Matcher matcher = pattern.matcher(stringBuilder);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }*/

//        String s = "My text hell";
        String s = "Мій текст";
        final String[] split = s.split("\\b");
    }
}
