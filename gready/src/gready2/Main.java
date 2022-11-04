package src.gready2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(i+1 + ". " + s[i]);
        }
    }
}
