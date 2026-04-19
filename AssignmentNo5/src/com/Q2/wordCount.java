package com.Q2;

import java.util.*;

public class wordCount {
    public static void main(String[] args) {
        String line = "my name is Pratiksha";

        String words[] = line.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }
    }
}
