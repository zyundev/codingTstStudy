package src.basic1023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] ss = s.split("\\.");
        for (String sss : ss) {
            System.out.println(sss);
        }
    }
}
