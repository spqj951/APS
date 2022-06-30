import java.util.Arrays;

public class Permutation_visited {
    static int[] nums;
    static int N;
    static boolean[] visited;
    static int[] sel;
    public static void main(String[] args) {
        nums = new int[]{0,1,2};
        N = 3;
        visited = new boolean[N];
        sel = new int[N];
        perm(0);
    }
    static void perm(int idx){
        if(idx == N){
            System.out.println(Arrays.toString(sel));
            return;
        }
        for(int i = 0; i < N; i++){
            if(visited[i]){
                continue;
            }
            sel[idx] = nums[i];
            visited[i] = true;
            perm(idx+1);
            visited[i] = false;
        }
    }
}
