package src.basic1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] times = time.split("\\.");
        System.out.printf("%04d.%02d.%02d", Integer.parseInt(times[0]), Integer.parseInt(times[1]), Integer.parseInt(times[2]));
    }
}
