import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Kruskal_comparator {

    static int[] p;

    public static void main(String[] args) {
        Scanner sc = new Scanner(input);

        int V = sc.nextInt();
        int E = sc.nextInt();

        int[][] edges = new int[E][3];

        for(int i =0; i < E; i++){
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();

        }

        Arrays.sort(edges, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });

        p = new int[V];

        for(int i = 0; i < V; i++){
            p[i] = i;
        }

        int ans = 0;

        int pick =0;
        for(int i =0; i < E; i++){
            int px = findSet(edges[i][0]);
            int py = findSet(edges[i][1]);

            if(px != py ){
                union(px, py);
                ans += edges[i][2];
                pick++;
            }
            if(pick == (V-1))
                break;
        }
        System.out.println(ans);
    }

    static void makeSet(int x){
        p[x] = x;
    }
    static int findSet(int x){
        if(p[x] !=x)
            p[x] = findSet(p[x]);
        return p[x];
    }
    static void union(int x, int y){
        p[findSet(y)] = findSet(x);
    }
    static String input = "7 11 \r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
            + "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "4 6 51\r\n" + "5 3 18\r\n" + "5 4 40\r\n";

}
