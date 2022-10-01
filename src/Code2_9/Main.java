package Code2_9;

import java.util.Scanner;

public class Main {

    public static int solution(int n, int[][] nList) {
        int answer = 0;
        int sum1;
        int sum2;

        for (int i = 0; i < n; i++){
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < n; j++){
                sum1 += nList[i][j];
                sum2 += nList[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i < n; i++){
            sum1 += nList[i][i];
            sum2 += nList[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nList = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                nList[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution(n, nList));
    }
}
