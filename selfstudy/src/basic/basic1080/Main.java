package src.basic.basic1080;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
            if (sum >= x){
                System.out.println(i);
                break;
            }
        }
    }
}
