package ua.com.alevel;

import java.util.stream.IntStream;

public class HomeWork_Unit2 {
    public void run() {
        System.out.println("HomeWork_Unit2.run");
//        ex_1();
//        ex_2();
        ex_3();
    }

    private void ex_1() {

        String text = "1w4tt!7";
        int sum = 0;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                int a = Integer.parseInt(String.valueOf(c));
                sum = sum + a;

            }
        }
        System.out.println(sum);
    }

    private void ex_2() {

        String text = "1w4tt!7";
        for (char c : text.toCharArray()) {
        if (Character.isAlphabetic(c)) {
           System.out.println(c);;
                }

            }
        }

    private void ex_3() {


    }


    }