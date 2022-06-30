public class BrutePatternMatch {
    public static void main(String[] args) {
        char[] text = "THis is a book".toCharArray();
        char[] pattern = "booo".toCharArray();
        System.out.println(BruteForce(text, pattern));

    }
    public static int BruteForce(char[] t, char[] p){

        int i = 0;
        int j = 0;
        int M = t.length;
        int N = p.length;

        while(i < M && j < N){
            if(t[i] != p[j]){
                i -= j;
                j = -1;

            }
            i++;
            j++;
        }
        if(j == N){
            return i - N;
        }
        else return -1;

    }
}
