package src.basic1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = sc.nextDouble();
        double d = (h*b*c*s) / 8 / 1024 / 1024;
        System.out.printf("%.1f MB", d);
    }
}
