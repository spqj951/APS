package BaekJoon;

import java.util.Scanner;

public class BJ_11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];

        for(int i =1;i <= N; i++){
            arr[i] = arr[i-1]+ sc.nextInt();
        }
        for(int i =0; i < M; i++){
            int k = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(arr[j] - arr[k-1]);
        }
    }
}
