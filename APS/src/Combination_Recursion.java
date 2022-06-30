import java.util.Arrays;

public class Combination_Recursion {
    static int[] data;
    static int[] sel;
    static int N, R;

    public static void main(String[] args) {
        data = new int[] {10,11,12,13,14};
        N = 5;
        R = 3;
        sel = new int[R];

        comb(0,0);
    }
    static void comb(int idx, int sidx){
        if(sidx == R){
            System.out.println(Arrays.toString(sel));
            return;
        }
        if(idx == N){
            return;
        }
        sel[sidx] = data[idx];
        comb(idx+1, sidx+1);
        comb(idx+1, sidx);
    }
}
