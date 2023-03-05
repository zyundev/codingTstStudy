package src.book.cleansw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ftocraw {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        boolean done = false;
        while (!done) {
            String fahrString = br.readLine();
            if (fahrString == null || fahrString.length() == 0) {
                done = true;
            } else {
                double fahr = Double.parseDouble(fahrString);
                double celcius = 5.0 / 9.0 * (fahr - 32);
                System.out.println("F=" + fahr + ", C=" + celcius);
            }
        }
        System.out.println("exit");
    }
}
