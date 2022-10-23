package src.basic1084;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] answers = bufferedReader.readLine().split(" ");
        int count = 0;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < Integer.parseInt(answers[0]); i++) {
            for (int j = 0; j < Integer.parseInt(answers[1]); j++) {
                for (int k = 0; k < Integer.parseInt(answers[2]); k++) {
                    bufferedWriter.write(i + " " + j + " " + k + "\n");
                    count++;
                }
            }
        }
        bufferedWriter.write(String.valueOf(count));
        bufferedWriter.flush();
    }
}
