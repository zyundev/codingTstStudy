package Code2_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Integer> pList = new ArrayList<>();

    public int solution(int i) {

        if (pList.isEmpty()) {
            pList.add(0, 1);
        } else {
            pList.add(i, i-1 > 0 ? pList.get(i-1) + pList.get(i-2) : pList.get(i-1));
        }

        return pList.get(i);
    }

    public static void main(String[] args) {
        Main action = new Main();
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            System.out.print(action.solution(i) + " ");
        }
    }
}
