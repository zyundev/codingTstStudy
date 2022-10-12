package src.basic1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long y = sc.nextInt();
        long z = sc.nextInt();
        System.out.println(x + y + z);
        System.out.println(String.format("%.1f", (x + y + z) / (float) 3));
    }
}
