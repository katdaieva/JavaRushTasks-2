package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        int m1, m2, m3;

        if (n1 >= n2 && n1 >= n3){
            m1 = n1;
            m2 = Math.max(n2,n3);
            m3 = Math.min(n2,n3);
        }
        else if (n2 >= n1 && n2 >= n3) {
            m1 = n2;
            m2 = Math.max(n1,n3);
            m3 = Math.min(n1,n3);
        }
        else {
            m1 = n3;
            m2 = Math.max(n1,n2);
            m3 = Math.min(n1,n2);
        }

        System.out.println(m1 + " " + m2 + " " + m3);

    }
}
