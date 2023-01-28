package src.basic.basic1048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf("%d", x << y); // x=1일때 2의 y승 , x =3 일때 8의 y승
    }
}
