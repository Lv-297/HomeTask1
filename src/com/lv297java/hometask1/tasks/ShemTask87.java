package com.lv297java.hometask1.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShemTask87 extends AbstractTest {

    private String number;
    private String n;

    private String getN() {
        return n;
    }

    private boolean isValueNumberAndNotEmpty(String value) {
        return value.chars().allMatch(Character::isDigit) && !value.equals("");
    }

    private boolean isValueNCorrect(String value) {
        return Integer.parseInt(getN()) <= number.length();
    }

    private void readData() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Please, enter some number");
            number = br.readLine();

            while (!isValueNumberAndNotEmpty(number)) {  // check for digit of empty input
                System.out.println("Value invalid. Try again");
                number = br.readLine();     // if input is non-digital try again
            }

            System.out.println("How many digits from the end of number you want to count the sum\n Enter the number (N)");
            n = br.readLine();

            while (!isValueNumberAndNotEmpty(n)) {        // check for digit input
                System.out.println("Please, enter a digit value of N\n Try again");
                n = br.readLine();   // if input is non-digital try again
            }

            while (!isValueNCorrect(n)) {
                System.out.println("You entered invalid value of N\n Try again");
                n = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getTheSumOfLastElements() {
        String a[] = number.split("");
        return Arrays.stream(a).mapToInt(Integer::parseInt).skip(a.length - Integer.parseInt(getN())).sum();
    }

    @Override
    public void execute() {
        readData();
        System.out.println(getTheSumOfLastElements());
    }


}
