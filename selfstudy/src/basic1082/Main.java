package src.basic1082;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hex = sc.nextInt(16);
        for (int i = 1; i < 16; i++){
            System.out.printf("%X*%X=%X\n", hex, i, hex*i);
        }
    }
}
