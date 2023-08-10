package com.caicai.learnJava;

/**
 * 计算各行平均数
 */

public class Demo01 {
    public static void main(String[] args) {

        int[][] scores = {
                {82, 81, 80},
                {90, 91, 92},
                {70, 71, 72},
        };

        //每行操作都一样，嵌套循环计算即可
        for (int i = 0; i < scores.length; i++) {

            double avg = 0;
            int count = 0;
            double total = 0;

            for (int j = 0; j < scores[i].length; j++) {

                total += scores[i][j];
                count++;
            }
            avg = total / count;
            System.out.println(avg);
        }

    }
}
