package Code2_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int solution(int c, ArrayList<Integer> key){
        // 첫번째 값이 max 로 잡고
        // max보다 큰 값이 나오면 cnt 하고 그 큰값을 max로 초기화
        int max = key.get(0);
        int cnt = 1;

        for (int i = 1; i < c; i++) {

            if (max < key.get(i)){
                cnt += 1;
                max = key.get(i);
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        ArrayList<Integer> key = new ArrayList<Integer>();
        for (int i = 0; i < c; i++){
            key.add(i, sc.nextInt());
        }

        System.out.println(solution(c, key));
    }
}
