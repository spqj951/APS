import java.util.Arrays;
import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];


        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }//input
        int[][] ans = new int[5][5];

        int[] dc = {0,0,-1,1};
        int[] dr = {-1,1,0,0};
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                for(int k = 0; k < 4; k++){

                        int nr = i + dr[k];
                        int nc = j + dc[k];
                        if(nr >=0 && nc >= 0 && nr < arr.length && nc < arr.length) {
                            ans[i][j] += Math.abs(arr[i][j] - arr[nr][nc]);
                        }
                 }
            }
        }// for end
        for(int i = 0 ; i < 5; i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}
