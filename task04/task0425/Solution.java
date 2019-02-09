package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        if (n1 > 0 && n2 > 0)
            System.out.println(1);
        if (n1 < 0 && n2 > 0)
            System.out.println(2);
        if (n1 < 0 && n2 < 0)
            System.out.println(3);
        if (n1 > 0 && n2 < 0)
            System.out.println(4);
    }
}
