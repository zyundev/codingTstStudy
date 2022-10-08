package src.basic1026;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] ss = s.split(":");
        int m = Integer.parseInt(ss[1]);
        System.out.println(m);
    }
}
