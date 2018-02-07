package com.lv297java.hometask1.tasks;

import com.lv297java.hometask1.AbstractTest;

public class ShemTask562 extends AbstractTest {

    public ShemTask562() {
        super("562");
    }

    private static void getArmstrongNumbers() {

        int i = 1, a, arm, n, temp;
        System.out.println("Armstrong numbers between 1 to 500 are");
        while (i < 999999999) {
            n = i;
            arm = 0;
            while (n > 0) {
                a = n % 10;
                arm = arm + (a * a * a);
                n = n / 10;
            }
            if (arm == i)
                System.out.println(i);
            i++;
        }

    }


    @Override
    public void execute() {
        getArmstrongNumbers();
    }


}
