package Code2_6;

import java.util.*;

public class Main {

    public static boolean isPrime(int num){
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer("" + arr[i]);
            String s = sb.reverse().toString();
            arr[i] = Integer.parseInt(s);

            if (isPrime(arr[i])) {
                answer.add(arr[i]);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
