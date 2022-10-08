package src.basic1028;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseUnsignedInt(sc.next());
        String result = Integer.toUnsignedString(n);
        System.out.println(result);
    }
}
