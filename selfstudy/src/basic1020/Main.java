package src.basic1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println(x.replaceAll("-", ""));
    }
}
