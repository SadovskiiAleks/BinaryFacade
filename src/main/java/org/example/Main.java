package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String numder20 = "10100";
        String number3 = "11";

        System.out.println("\nДемонстрация");
        System.out.println(bins.sum(numder20, number3));
        System.out.println(bins.mult(numder20, number3));

        System.out.println("\nПроверка");
        System.out.println(Integer.parseInt(bins.sum(numder20, number3), 2));
        System.out.println(Integer.parseInt(bins.mult(numder20, number3), 2));
    }
}