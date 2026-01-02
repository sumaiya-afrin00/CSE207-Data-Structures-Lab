package infixToPostFix;

import java.util.Stack;

public class PostfixEval {

    public static int evaluate(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();

                int res = 0;
                switch (ch) {
                    case '+': 
                    	res = a + b; 
                    	break;
                    case '-': 
                    	res = a - b; 
                    	break;
                    case '*': 
                    	res = a * b; 
                    	break;
                    case '/': 
                    	res = a / b; 
                    	break;
                    case '^': 
                    	res = (int)Math.pow(a, b); 
                    	break;
                }
                stack.push(res);
                System.out.println(ch + "\t" + stack + "\t\t"+ a + " " + b + " = "+ res);
            }
            
        }
        return stack.pop();
    }
}
