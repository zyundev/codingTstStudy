package src.basic1022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String x = sc.nextLine();
            if (x.length() > 2000){
                continue;
            }
            System.out.println(x);
            break;
        }
    }
}
