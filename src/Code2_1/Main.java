package Code2_1;

import java.util.Scanner;

public class Main {

    public static String solution(int[] list) {
        String result = "" + list[0];

        for(int i = 0; i < list.length; i++){

            if (i+1 == list.length){ //overflow 방지
                break;
            }

            if (list[i] <= list[i+1]) { //같거나 크면
                if (!result.contains(" "+list[i+1])){ //result에 해당값이 없을때만 삽입
                    result += " " + list[i+1];
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] list = new int[length];

        for(int i = 0; i < length; i++){
            list[i] = scanner.nextInt();
        }

        System.out.println(solution(list));
    }
}