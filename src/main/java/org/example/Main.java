package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 55;
        int b = 33;
        int c = 2147483647;
        double d = 1.5;
        System.out.println("Сложение a+b="+(a+b));
        System.out.println("Вычитание a-b="+(a-b));
        System.out.println("Умножение a*b="+(a*b));
        System.out.println("Деление a/b="+(a/b));
        System.out.println("Получение остатка от деления a%b="+(a%b)+ "\n");
        System.out.println("Логические операторы"+ "\n");
        System.out.print("a > (b + 40) ");
        System.out.println (a > (b + 40));
        System.out.print("a < (b * 3) ");
        System.out.println(a < (b * 3));
        System.out.print("a >= (b + 20) ");
        System.out.println(a >= (b + 20));
        System.out.print("a <= (b + 2) ");
        System.out.println(a <= (b + 2));
        System.out.print("a == (b + 22)");
        System.out.println(a == (b + 22));
        System.out.println("Переполнение"+(c+b));
        System.out.println (a+d);
    }
}