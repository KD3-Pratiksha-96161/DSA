package com.Q2;
import java.io.*;
import java.util.*;

public class WordCountFile {
    public static void main(String[] args) throws Exception {
        File file = new File("data.txt");
        Scanner sc = new Scanner(file);

        HashMap<String, Integer> map = new HashMap<>();

        while (sc.hasNext()) {
            String word = sc.next();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        sc.close();

        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }
    }
}