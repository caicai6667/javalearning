package com.caicai.learnJava;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Imput your weight");
        float weight = scanner.nextFloat();
        scanner.close();

        if(weight<=18.5){
            System.out.println("过轻");
        }
       else if(weight<=25){
            System.out.println("正常");
        }
        else if(weight<=28){
            System.out.println("过重");
        }
        else if(weight<=32){
            System.out.println("肥胖");
        }
        else {
            System.out.println("非常肥胖");
        }

    }
}
