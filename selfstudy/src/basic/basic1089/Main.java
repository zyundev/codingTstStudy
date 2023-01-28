package src.basic.basic1089;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 1;

        while (count < n) {
            a += d;
            count++;
        }
        System.out.println(a);
    }
}
