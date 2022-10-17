package src.basic1050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int flag = x == y ? 1 : 0;
        System.out.println(flag);
    }
}
