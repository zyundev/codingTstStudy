package Code2_5;

import java.util.*;

public class Main {

    public static int solution(int n) {
        int check = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                check++;
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n = 20
        // 1, 2, 3, 4, 5, 6 ... n(20) = data 저장
        // 1은 무조건 소수가 아니기에 패스
        // 2 부터 체크
        // n % n-i == 0 이면(ex 20 / 19 == 0 , 20 / 18 == 0 ... 20 / 1 == 0 ) 소수아님 체크
        // n = n - 1; ex) n = 19 로 점점 줄이면서 체크
// --------------------------------------------------------------------------
        // 에라토스테네스의 체를 이용해서 구현
        // 우선 공간 n+1 만큼 채움 index번호가 n도 나와야하기 추가
        // 2는 무조건 소수이기에 2부터 시작
        // 2번째 공간이 0 이면 cnt
        // 2의 배수의 공간은 소수가 아니기에 1로 초기화 시키기
        // 공간 번호의 값이 0이면 소수로 cnt
        System.out.println(solution(n));

    }
}
