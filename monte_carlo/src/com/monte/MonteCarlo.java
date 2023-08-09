package com.monte;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MonteCarlo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //k为模拟次数，N为每次模拟总抽奖数，M为每次模拟奖券数
        System.out.print("Enter simulationCount: ");
        int k = scanner.nextInt();

        System.out.print("Enter M (totalDraws): ");
        double M = scanner.nextDouble();

        System.out.print("Enter N (totalTickets): ");
        double N = scanner.nextDouble();

        // 创建整数矩阵
        int rows = k;
        int cols = (int) N;
        int[][] matrix = new int[rows][cols];

        Random random = new Random();

        for (int j = 0; j < k; j++) {
            double t = random.nextDouble();

            if (t < M / N) {
                matrix[j][0] = 1;
            } else {
                matrix[j][0] = 0;
            }

            for (int i = 1; i < N; i++) {
                double r = random.nextDouble();

                double probability = (M - Arrays.stream(matrix[j]).sum()) / (N - i);
                if (r < probability) {
                    matrix[j][i] = 1;
                } else {
                    matrix[j][i] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}