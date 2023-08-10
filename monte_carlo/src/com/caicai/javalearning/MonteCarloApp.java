package com.caicai.javalearning;

import java.util.Arrays;
import java.util.Scanner;

public class MonteCarloApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter simulationCount: ");
        int k = scanner.nextInt();

        System.out.print("Enter M (totalDraws): ");
        double M = scanner.nextDouble();

        System.out.print("Enter N (totalTickets): ");
        double N = scanner.nextDouble();

        scanner.close();

        int[][] resultMatrix = MonteCarloSimulation.simulate(k, M, N);

        System.out.println(Arrays.deepToString(resultMatrix));
    }
}