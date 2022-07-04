package BaekJoon;

import java.util.*;

public class BJ_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();//전체 사람 수
        int K = sc.nextInt();//K번째 사람

        Queue<Integer> que = new LinkedList<>();

        for(int i = 0; i < N;  i++){
            que.add(i+1);
        }
        sb.append('<');
        while(que.size() >1){
            for(int i = 0; i < K-1; i++){
                que.add(que.poll());

            }
            sb.append(que.poll()).append(", ");
        }
        sb.append(que.poll()).append('>');

        System.out.println(sb);

    }
}
