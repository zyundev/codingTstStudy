package src.basic1091;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        long result = a;
        for (int i = 1; i < n; i++) {
            result = result*m + d;
        }
        System.out.println(result);
    }
}
