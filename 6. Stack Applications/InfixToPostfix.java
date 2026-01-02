package infixToPostFix;

import java.util.Stack;

public class InfixToPostfix {
    Stack<Character> stack;
    StringBuilder result;

    public InfixToPostfix() {
        stack = new Stack<>();
        result = new StringBuilder();
    }

    public int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-': 
            	return 1;
            case '*':
            case '/': 
            	return 2;
            case '^': 
            	return 3;
        }
        return -1;
    }

    public void infixToPostFix(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
            System.out.println(ch + "\t \t" + result + "\t\t"+ stack);
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
    }

    public StringBuilder getResult() {
        return result;
    }

}
