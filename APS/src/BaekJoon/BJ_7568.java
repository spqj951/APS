package BaekJoon;

import java.util.Scanner;

public class BJ_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }//input
        for(int i = 0; i < N; i++){
            int rank = 1;
            for(int j =0;j < N; j++){
                if(i==j){
                    continue;
                }
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }

}
