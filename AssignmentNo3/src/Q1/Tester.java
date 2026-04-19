package Q1;
	import java.util.Stack;

	public class Tester {
	    public static int calculate(int op1, char opr, int op2) {
	        switch(opr) {
	            case '+': return op1 + op2;
	            case '-': return op1 - op2;
	            case '*': return op1 * op2;
	            case '/': return op1 / op2;
	            case '%': return op1 % op2;
	            case '$': return (int)Math.pow(op1, op2);
	        }
	        return 0;
	    }

	    public static int postfixEvaluate(String postfix) {
	        Stack<Integer> st = new Stack<>();
	        // Split by space to handle multi-digit numbers
	        String[] tokens = postfix.split(" ");

	        for (String token : tokens) {
	            if (token.isEmpty()) continue;

	            // Check if the token is a number 
	            if (Character.isDigit(token.charAt(0))) {
	                st.push(Integer.parseInt(token));
	            } else {
	                // Operator: pop op2 first, then op1
	                int op2 = st.pop();
	                int op1 = st.pop();
	                int res = calculate(op1, token.charAt(0), op2);
	                st.push(res);
	            }
	        }
	        return st.pop();
	    }

	    public static int prefixEvaluate(String prefix) {
	        Stack<Integer> st = new Stack<>();
	        String[] tokens = prefix.split(" ");

	        // Process tokens from right to left
	        for (int i = tokens.length - 1; i >= 0; i--) {
	            String token = tokens[i];
	            if (token.isEmpty()) continue;

	            if (Character.isDigit(token.charAt(0))) {
	                st.push(Integer.parseInt(token));
	            } else {
	                // Operator: pop op1 first, then op2
	                int op1 = st.pop();
	                int op2 = st.pop();
	                int res = calculate(op1, token.charAt(0), op2);
	                st.push(res);
	            }
	        }
	        return st.pop();
	    }

	    public static void main(String[] args) {
	       
	        String postfix = "10 2 + 3 *";
	        System.out.println("Postfix: " + postfix);
	        System.out.println("Result: " + postfixEvaluate(postfix));

	     
	        String prefix = "/ 100 + 10 10";
	        System.out.println("\nPrefix: " + prefix);
	        System.out.println("Result: " + prefixEvaluate(prefix));
	    }
	}


