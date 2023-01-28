package src.basic.basic1087;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
            if (sum >= x) {
                break;
            }
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write("" + sum);
        bufferedWriter.flush();
    }
}
