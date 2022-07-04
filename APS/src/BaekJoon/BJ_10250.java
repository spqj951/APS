package BaekJoon;

import java.util.Scanner;

public class BJ_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int k  =0; k  < T; k++){

            int H =sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int[][] arr = new int[H][W];
            for(int i  =0; i < arr.length; i++){
                for(int j = 0; j <arr[i].length; j++){
                    arr[i][j] = (i+1)*100 + (j+1);

                }
            }
            int h = N%H;
            if( h == 0){
                h+=H;
            }
            int w = (N/H)+1;
            if( N%H ==0){
                w= N/H;
            }
            System.out.println(arr[h-1][w-1]);
        }
    }
}
