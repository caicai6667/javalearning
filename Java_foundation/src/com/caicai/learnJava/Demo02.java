package com.caicai.learnJava;

/**
 * 计算pi的近似值
 * 用到四舍五入round()函数
 * 先进i位取整四舍五入，再除回来
 */
public class Demo02 {
    public static void main(String[] args) {

        double pi = 0;
        double error = 0.0001;
        for(int i=0;Math.abs(pi-Math.PI)>error;i++){

            pi=Math.round(Math.PI*Math.pow(10,i))*Math.pow(0.1,i);

        }

        System.out.printf("%.15f%n",pi);
    }

}
