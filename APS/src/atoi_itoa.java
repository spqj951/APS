public class atoi_itoa {
    public static void main(String[] args) {
        System.out.println(atoi("5984403"));
        System.out.println(12342);
    }
    public static int atoi(String str){
        int value = 0;
        int digit;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <='9'){
                digit = str.charAt(i) - '0';
            }
            else {
                System.out.println("this is not a number");
                break;
            }
            value = (value*10)+ digit;
        }
        return value;
    }

    public static String itoa(int num){
        StringBuilder sb = new StringBuilder();
        int tmp = num;
        while(tmp > 0){
            char c = (char)(tmp % 10 + 48);
            sb.append(c);
            tmp /= 10;
        }
        return sb.reverse().toString();
    }
}
