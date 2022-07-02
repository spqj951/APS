import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dijkstra {
    static class Node{
        int v, weight;

        public Node(int v, int weight){
            this.v = v;
            this.weight = weight;
        }
    }

    static final int INF = Integer.MAX_VALUE;
    static int V, E;
    static List<Node>[] adjList;
    static int[] dist;

    public static void main(String[] args){
        Scanner sc = new Scanner(input);

        V = sc.nextInt();
        E = sc.nextInt();

        adjList = new ArrayList[V];

        for(int i =0; i < V; i++){
            adjList[i] = new ArrayList<>();

        }
        dist = new int[V];

        Arrays.fill(dist, INF);

        for(int i =0; i < E; i++){
            int st= sc.nextInt();
            int ed = sc.nextInt();
            int w = sc.nextInt();
            adjList[st].add(new Node(ed, w));
        }

        dijkstra(0);

        System.out.println(Arrays.toString(dist));
    }

    static void dijkstra(int st){
        boolean[] visited = new boolean[V];

        dist[st] = 0;

        for(int i = 0; i< V-1; i++){
            int minIdx = -1;
            int minValue = INF;

            for(int j =0; j <V; j++){
                if(!visited[j] &&minValue > dist[j]){
                    minValue = dist[j];
                    minIdx =j;
                }
            }
            if(minIdx ==-1){
                break;
            }
            visited[minIdx] = true;

            for(int j = 0; j < adjList[minIdx].size(); j++){
                Node cur = adjList[minIdx].get(j);
                if(!visited[cur.v] && dist[cur.v] > dist[minIdx] + cur.weight){
                    dist[cur.v] = dist[minIdx] + cur.weight;
                }
            }

        }
    }
    static String input = "7 11 \r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
            + "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "4 6 51\r\n" + "5 3 18\r\n" + "5 4 40\r\n";

}
