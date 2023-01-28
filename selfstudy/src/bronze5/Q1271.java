package src.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger money = sc.nextBigInteger();
        BigInteger alien = sc.nextBigInteger();
        System.out.println(money.divide(alien));
        System.out.println(money.remainder(alien));
    }
}
