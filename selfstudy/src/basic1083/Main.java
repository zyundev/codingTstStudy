package src.basic1083;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0){
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
