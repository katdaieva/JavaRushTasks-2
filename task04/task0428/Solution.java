package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);

        int cnt = 0;

        if (n1 > 0)
            cnt += 1;
        if (n2 > 0)
            cnt += 1;
        if (n3 > 0)
            cnt += 1;

        System.out.println(cnt);
    }
}
