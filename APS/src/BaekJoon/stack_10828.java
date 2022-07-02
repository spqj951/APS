package BaekJoon;

import java.util.Scanner;

public class stack_10828 {
    static int size =0;

    static int[]arr ;
    static int pop(){{
        if(size == 0){
            return -1;

        }
        else {
            int res = arr[size-1];
            arr[size-1] = 0;
            size--;
            return res;
        }
    }}

    static void push(int num){
        arr[size] = num;
        size++;

    }
    static int top(){
        if(size ==0){
            return -1;
        }
        else{
            return arr[size-1];
        }
    }
    static int size(){
        return size;
    }
    static int empty(){
        if(size ==0){
            return 1;
        }
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        int N = sc.nextInt();
        arr = new int[N];

        for(int i =0; i < N; i++){
            switch(sc.next()){
                case "push" :
                    push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
            }
        }
        System.out.println(sb);

    }
}
