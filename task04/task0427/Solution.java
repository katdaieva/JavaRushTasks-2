package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);

        String res;

        if (n % 2 == 0)
            res = "четное ";
        else
            res = "нечетное ";

        if (n < 10)
            res += "однозначное ";
        else if (n >= 10 && n <= 99)
            res += "двузначное ";
        else if (n >= 100 && n <= 999)
            res += "трехзначное ";

        if (n >= 1 && n <= 999)
            System.out.println(res + "число");
    }
}
