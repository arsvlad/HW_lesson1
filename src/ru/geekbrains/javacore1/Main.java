package ru.geekbrains.javacore1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // ЗАДАНИЕ 2

        boolean var1 = true;
        byte var2 = 110;
        char var3 = 'x';
        double var4 = 3.1416;
        float var5 = 3.14f;
        int var6 = 34;
        long var7 = 4123554L;
        short var8 = 327;


        // ЗАДАНИЕ 3

        System.out.println("Задание 3");
        System.out.println (caclul_1(5, 6, 7, 8));


        // ЗАДАНИЕ 4

        System.out.println("Задание 4");
        System.out.println("Введите два числа (через Enter):");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println (calcul_2 (a, b));



        // ЗАДАНИЕ 5

        System.out.println("Задание 5");
        System.out.println("Введите число:");

        Scanner sc1 = new Scanner(System.in);

        int a1 = sc.nextInt();

        calcul_3(a1);


        // ЗАДАНИЕ 6

        System.out.println("Задание 6");
        System.out.println("Введите число:");

        Scanner sc4 = new Scanner(System.in);

        int c = sc4.nextInt();

        System.out.println (calcul_4 (c));


        // ЗАДАНИЕ 7

        System.out.println("Задание 7");
        System.out.println("Введите ваше имя:");

        Scanner sc2 = new Scanner(System.in);

        var a2 = sc2.nextLine();

        hi_name(a2);


        // ЗАДАНИЕ 8

        System.out.println("Задание 8");
        System.out.println("Введите год:");

        Scanner sc3 = new Scanner(System.in);

        int y = sc3.nextInt();

        sc3.close();

        year(y);

    }


    // МЕТОД ДЛЯ ЗАДАНИЯ 3

    static double caclul_1(double a, double b, double c, double d) {

        return (a * (b + (c / d)));
        
    }


    // МЕТОД ДЛЯ ЗАДАНИЯ 4

    static boolean calcul_2(int a, int b) {

        int sum = a + b;

        return (sum >= 10 & sum <= 20);

    }


    // МЕТОД ДЛЯ ЗАДАНИЯ 5

    static void calcul_3(int a) {

        if (a >= 0) {

            System.out.println("Введенное число - положительное.");
        } else {

            System.out.println("Веденное число - отрицательное.");
        }

    }


    // МЕТОД ДЛЯ ЗАДАНИЯ 6

    static boolean calcul_4 (int c) {

        return ( c < 0);

    }



    // МЕТОД ДЛЯ ЗАДАНИЯ 7

    static <string> void hi_name(string a2) {

        System.out.println("Привет, " + a2);

    }


    // МЕТОД ДЛЯ ЗАДАНИЯ 8

    static void year(int y) {

        if ((y % 4) > 0) {

            System.out.println(y + " год - НЕ високосный.");

        } else if ((y % 100) > 0) {

            System.out.println(y + " год - високосный.");

        } else if ((y % 400) == 0) {

            System.out.println(y + " год - високосный.");

        }

    }


}

