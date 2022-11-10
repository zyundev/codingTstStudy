package src.gready6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println(scanner.nextInt() + scanner.nextInt());
        }
    }
}
