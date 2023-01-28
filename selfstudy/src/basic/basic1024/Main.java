package src.basic.basic1024;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] chs = s.toCharArray();
        for (char ch : chs){
            System.out.println("'" + ch + "'");
        }
    }
}
