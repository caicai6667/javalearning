package com.caicai.learnJava;
/**
 * 冒泡算法
 * 从大到小排列
 */

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {

        int[] scores = {28,12,89,66,34,43};
        int t ;
        for(int i=0;i<scores.length-1;i++){

            for (int j=0;j<scores.length-i-1;j++){

                if(scores[j]<scores[j+1]){

                    t = scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(scores));
    }
}
