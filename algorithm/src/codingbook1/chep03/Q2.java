package codingbook1.chep03;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject = sc.nextInt();
        int[] grade = new int[subject];
        int average = 0;
        int sum = 0;
        for (int i = 0; i < subject; i++) {
            grade[i] = sc.nextInt();
        }
        int max = Arrays.stream(grade).max().getAsInt();
        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        average = sum * 100 / subject / max;
        System.out.println(average);
    }
}
