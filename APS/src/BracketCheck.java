import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        String bracket = "((()((((()()((()())((())))))";

        char[] b = bracket.toCharArray();
        Stack<Character> s = new Stack<>();

        outer: for(int i = 0; i < b.length; i++){
            switch(b[i]){
                case '(':
                    s.push(b[i]);
                    break;
                case ')':
                    if(!s.isEmpty() && s.peek() == '('){
                        s.pop();
                        continue;
                    }
                    else {
                        s.push(b[i]);

                        break outer;
                    }
            }
        }
        if(!s.isEmpty()){
            System.out.println("fault");
        }
        else{
            System.out.println("good");
        }
    }
}
