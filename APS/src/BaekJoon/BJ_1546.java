package BaekJoon;

import java.util.Scanner;

public class BJ_1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            double[] arr = new double[N];
            double max =0;
            for(int i=0; i < N; i++){
                arr[i] = sc.nextInt();
                if(arr[i] > max){
                    max = arr[i];
                }
            }

            double sum =0;
            for(int i =0; i < N; i++){
                arr[i] = (arr[i]/max)*100;

                sum += arr[i];
            }
            System.out.println((double)sum/N);


    }
}
