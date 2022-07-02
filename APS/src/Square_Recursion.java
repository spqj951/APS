public class Square_Recursion {
    public static void main(String[] args) {
        int c = 2;
        int n = 5;

        System.out.println(power(c,n));
    }
    static int power(int c, int n){
        if(n ==1){
            return c;
        }
        int result;
        if(n % 2 == 0){
            result = power(c, n/2);
            return result*result;
        }
        else {
            result = power(c, (n-1)/2);
            return result*result*c;
        }
    }
}
