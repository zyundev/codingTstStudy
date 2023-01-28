package src.basic.basic1035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int hex = Integer.parseInt(s, 16); // 16진수를 10진수로 변환
        System.out.printf("%o", hex);
    }
}
