package src.basic.basic1025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char[] chs = num.toCharArray();
        for (int i = chs.length; i > 0; i--) {
            Double d = Math.pow(10, i - 1);
            int result = Integer.parseInt(String.valueOf(chs[chs.length - i])) * d.intValue();
            System.out.println("[" + result + "]");
        }
    }
}

