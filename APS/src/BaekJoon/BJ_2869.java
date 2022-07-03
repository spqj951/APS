package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class BJ_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());



        //낮에는 +A
        //밤되면 -B
        //하루 지나면 date++, +A -> 높이 다다르면 끝


       int date = (V-B)/(A-B);
       if((V-B)%(A-B) !=0){
           date++;}
        System.out.println(date);

    }
}
