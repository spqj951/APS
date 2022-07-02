import java.util.Arrays;
import java.util.Scanner;

public class Prim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(input);

        int V = sc.nextInt();
        int E = sc.nextInt();

        int[][] adjArr = new int[V][V];

        for(int i = 0; i < E; i++){
            int st = sc.nextInt();
            int ed = sc.nextInt();
            int w = sc.nextInt();

            adjArr[st][ed] = w;
            adjArr[ed][st] = w;
        }

        boolean[] visited = new boolean[V];
        int[] dist = new int[V];
        int[] p = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[0] = 0;
        p[0] = -1;

        int min, idx, ans =0;

        for(int i = 0; i < V-1; i++){
            min = Integer.MAX_VALUE;
            idx = -1;

            for(int j =0; j < V; j++){
                if(!visited[j] && dist[j] < min){
                    min = dist[j];
                    idx = j;
                }
            }
            visited[idx] = true;
            for(int j = 0; j < V; j++){
                if(!visited[j] && adjArr[idx][j] != 0  && dist[j] > adjArr[idx][j]){
                    p[j] = idx;
                    dist[j] = adjArr[idx][j];
                }
            }
        }
    }
    static String input = "7 11 \r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
            + "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "4 6 51\r\n" + "5 3 18\r\n" + "5 4 40\r\n";
}
