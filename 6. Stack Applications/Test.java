package infixToPostFix;

public class Test {
    public static void main(String[] args) {

        String exp1 = "a+b*c+(d*e+f)-g^b";
        
        InfixToPostfix c1 = new InfixToPostfix();
        c1.infixToPostFix(exp1);
        System.out.println("Postfix (letters): " + c1.getResult());

        String numExp = "3+4*2";

        InfixToPostfix c5 = new InfixToPostfix();
        c5.infixToPostFix(numExp);
        String postfixNum = c5.getResult().toString();

        System.out.println("\nPostfix (numeric): " + postfixNum);

        int value = PostfixEval.evaluate(postfixNum);
        System.out.println("\nEvaluation: " + value);
    }
}


