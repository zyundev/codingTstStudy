package src.basic1034;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int octal = Integer.parseInt(s, 8);
        System.out.printf("%d", octal);
    }
}
