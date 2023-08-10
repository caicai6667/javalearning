package com.caicai.javalearning;

import java.util.Arrays;
import java.util.Random;

public class MonteCarloSimulation {

    public static int[][] simulate(int k, double M, double N) {
        int[][] matrix = new int[k][(int) N];
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

        return matrix;
    }
}