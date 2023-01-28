package src.basic.basic1090;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        long result = 0;
        result = (long) (a * Math.pow(r, n-1));
        System.out.println(result);
    }
}
