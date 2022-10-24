package src.basic1086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double b = sc.nextDouble();
        double d = (w * h * b) / 8 / 1024 / 1024;
        System.out.printf("%.2f MB", d);
    }
}
