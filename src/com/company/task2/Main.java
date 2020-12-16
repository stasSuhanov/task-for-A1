package com.company.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("введите число");

        for(int number = 3; number<20;number++) {
            long denominator = getFactorial(number);
            long sumOfFact = getSumFactorial(number);

            double sum = 1.0 / denominator * sumOfFact;
            System.out.print("Ваша сумма при n = "+number+" "+":");
            System.out.printf("'%5.6f'%n", sum);

        }
        System.out.println("un стремиться к нулю");
    }
    public static long getFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    public static long getSumFactorial(int n) {
        long result = 1;
        long sum = 0;
        int i, j = 1;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                result = result * j;
            }
            sum += result;
            result = 1;
        }
        return sum;
    }
}
