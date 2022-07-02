import java.util.Scanner;

public class EdgeList {
    static class Edge{
        int st, ed;

        public Edge(int st, int ed){
            this.st = st;
            this.ed = ed;
        }

        @Override
        public String toString() {
            return "Edge [st= " + st + ", ed= " + ed + "]";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        Edge[] edges = new Edge[E];

        for(int i = 0; i < E; i++){
            int st = sc.nextInt();
            int ed= sc.nextInt();

            edges[i] = new Edge(st, ed);

            System.out.println(edges[i]);
        }
    }
}
