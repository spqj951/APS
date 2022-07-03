package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class Bj_4949 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);



        while(true){
            String str = sc.nextLine();

            if(str.equals(".")){
                break;
            }
            System.out.println(bal(str.toCharArray()));
        }





    }
    static String bal(char[] str){
        Stack<Character> stack = new Stack<>();
        for(int i =0; i < str.length; i++){
            if(str[i] == '(' || str[i] == '['){
                stack.push(str[i]);
            }
            else if(str[i] == ')'){
                if(!stack.isEmpty()&&stack.peek() == '('){
                    stack.pop();
                }
                else{
                    return "no";
                }
            }
            else if(str[i] == ']'){
                if(!stack.isEmpty()&&stack.peek() == '['){
                    stack.pop();
                }
                else{
                    return "no";

                }
            }

        }

            if(stack.isEmpty()){
                return "yes";
            }
            else {
                return "no";
            }
    }
}
