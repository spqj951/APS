import java.util.Arrays;

public class Stack {
    static int N =10;
    public static void main(String[] args) {
        int[] stack = new int[N];
        for(int i =0; i < stack.length; i++){
            stack[i] = Integer.MIN_VALUE;
        }
        push(stack, 20);
        push(stack, 29);
        push(stack, 11);
        push(stack, 5);
        System.out.println(isEmpty(stack));
        System.out.println(Arrays.toString(stack));
        System.out.println(pop(stack));
        System.out.println(pop(stack));
        System.out.println(pop(stack));
        System.out.println(pop(stack));

        System.out.println(isEmpty(stack));
        push(stack, 20);
        System.out.println(Arrays.toString(stack));
    }
    public static void push(int[] s,int a){
        --N;
//        if(s[N] != Integer.MIN_VALUE){
//            --N;
//            push(s, a);
//        }
        s[N] = a;

    }
    public static int pop(int[] s ) throws ArrayIndexOutOfBoundsException{
        int i =0;
       while(s[i] == Integer.MIN_VALUE){
           i++;

       }
       N++;
       int sol = s[i];
       s[i] =Integer.MIN_VALUE;
       return sol;
    }

    public static int peek(int[] s){
        int i =0;
        while(s[i] == Integer.MIN_VALUE){
            i++;
        }
        return s[i];
    }

    public static boolean isEmpty(int[] s){
        for(int i =0; i < s.length;i++){
            if(s[i] != Integer.MIN_VALUE){
                return false;
            }

        }
        return true;
    }

    public static boolean isFull(int[] s){
        for(int i =0; i <s.length; i++){
            if(s[i] == Integer.MIN_VALUE){
                return false;
            }
        }
        return true;
    }
}
