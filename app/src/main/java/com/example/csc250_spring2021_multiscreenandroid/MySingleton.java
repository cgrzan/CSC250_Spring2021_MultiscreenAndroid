package com.example.csc250_spring2021_multiscreenandroid;

public class MySingleton {
    public static int fact;
    public static int sqrt;

    public static int factCalc(int num) {
        if (num <= 0)
            return 0;
        else if (num == 1)
            return 1;
        else
            return num * factCalc(num - 1);

    }
    public static void initialize(int num){
        fact = factCalc(num);

    }
    public static int sqrtCalc(int fact){
        if (fact >= 0) {
            Math.sqrt(fact);
            return sqrt;
        }
        else
            return 0;

    }
    public static void start(int fact){
        sqrt = sqrtCalc(fact);
    }
}