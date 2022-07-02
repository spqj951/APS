import java.util.Arrays;
import java.util.Scanner;

public class adjMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        int[][] adjArr = new int[V+1][V+1];

        for(int i =0; i < E; i++){
            int st = sc.nextInt();
            int ed = sc.nextInt();

            adjArr[st][ed]=1;
            adjArr[ed][st] = 1;


        }

        for(int i =0; i < V+1; i++){
            System.out.println(Arrays.toString(adjArr[i]));
        }
    }
}
