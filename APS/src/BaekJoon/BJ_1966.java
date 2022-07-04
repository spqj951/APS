package BaekJoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_1966 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

       int tc = sc.nextInt();
       for(int i = 0; i <  tc; i++) {
           int N = sc.nextInt();
           int C = sc.nextInt();

           Queue<int[]> que = new LinkedList<>();
           for (int j = 0; j < N; j++) {
               que.add(new int[]{j, sc.nextInt()});
           }
           int cnt =0;
           while (true) {
               int[] now = que.poll();
               boolean flag = true;

               for (int[] q : que) {
                   if (q[1] > now[1]) {
                       flag = false;
                       break;
                   }
               }
               if (flag) {
                   cnt++;

                   if (now[0] == C) {
                       System.out.println(cnt);
                       break;
                   }
               } else {
                   que.add(now);


               }

           }
       }

    }
}
