package BaekJoon;

import java.util.Scanner;

public class BJ_2775 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//TC
        for(int h =0; h < T; h++){
            int k = sc.nextInt()+1;
            int n = sc.nextInt();
            int[][] arr =new int[k][n];

            for(int i = 0; i<k; i++){
                arr[i][0] = 1;
            }
            for(int i = 1; i< n; i++){
                arr[0][i] = i+1;
            }

            for(int i = 1; i <k; i++){
                for(int j = 1; j < n; j++){
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];

                }
            }
            System.out.println(arr[k-1][n-1]);
        }
    }


}
