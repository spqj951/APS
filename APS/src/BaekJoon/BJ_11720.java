package BaekJoon;

import java.util.Scanner;

public class BJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        String str = sc.next();
        int sum = 0;
        for(int i =0; i < str.length(); i++){
            sum += str.charAt(i)-48;

        }
        System.out.println(sum);
    }
}
