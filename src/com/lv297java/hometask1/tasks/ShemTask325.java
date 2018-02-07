package com.lv297java.hometask1.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ShemTask325 extends AbstractTest {


    private static void getPrimeFactor() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter any Number to find Prime Factors ");
            int number = Integer.parseInt(br.readLine());
            System.out.print("Prime Factors are : ");

            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    System.out.print(i + " ");
                    number = number / i;
                }
            }

            if (number < 1) System.out.println(number);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void execute() {
        getPrimeFactor();
    }
}





