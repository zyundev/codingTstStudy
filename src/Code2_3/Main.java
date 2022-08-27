package Code2_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String solution(int a, int b) {

        String winner = "";

        if(a != b) {
            if (a == 1) {
                if (b == 2) {
                    winner = "B";
                } else {
                    winner = "A";
                }

            } else if (a == 2) {
                if (b == 1) {
                    winner = "A";
                } else {
                    winner = "B";
                }

            } else if (a == 3) {
                if (b == 1) {
                    winner = "B";
                } else {
                    winner = "A";
                }
            }
        } else {
            winner = "D";
        }
        return winner;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        ArrayList<Integer> aLine = new ArrayList<>();
        ArrayList<Integer> bLine = new ArrayList<>();

        for (int i = 0; i < c; i++){
            aLine.add(i, sc.nextInt());
        }

        for (int i = 0; i < c; i++){
            bLine.add(i, sc.nextInt());
        }

        for (int i = 0; i < c; i++){
            System.out.println(solution(aLine.get(i), bLine.get(i)));
        }

    }
}
