package holding.exercises;
import net.mindview.util.Stack;

public class HoldingEx15 {
	public static void evaluateExpression(Stack<Character> stack, String expression) {
		for(int i = 0; i < expression.length(); i++) {
			if(expression.charAt(i) == '+') {
				for(int j = i + 1; j < expression.length(); j++) {
					if(expression.charAt(j) != '+' && expression.charAt(j) != '-') {
						stack.push(expression.charAt(j));
						break;
					}
				}
			}
			else if(expression.charAt(i) == '-') 
				System.out.print(stack.pop());
		}
	}
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		String expression = "+U+n+c--+e+r+t--+a-+i-+n+t+y--+-+r+u--+l+e+s--";
		evaluateExpression(stack, expression); 
	}
}
