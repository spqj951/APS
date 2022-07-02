public class Square_fo {
    public static void main(String[] args) {
        int C = 2;
        int N = 10;

        System.out.println(power(C,N));
    }
    static int power(int c, int n){
        int result = 1;
        for(int i = 0; i < n; i++){
            result *=c;
        }
        return result;
    }
}
