package codingbook1.chep03;

import java.util.Scanner;

public class Q1 {
    //숫자 합 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        String sNum = "";
        while (true) {
            sNum = sc.next();
            if (n == sNum.length()){
                break;
            }
        }
        char[] chList = sNum.toCharArray();
        for (int i = 0; i < chList.length; i++) {
            //sum += chList[i] - '0'; // 아스키 코드로 int를 변환시킨것임 '0' : 48
            sum += Character.getNumericValue(chList[i]); // 이 방법도 있음
        }
        System.out.println(sum);
    }
}
