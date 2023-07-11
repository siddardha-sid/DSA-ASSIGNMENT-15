package problems;

import java.util.Stack;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i='5'-'0';
String s = "123+*8-";
System.out.println(postFix(s,s.length()));;
	}
	public static int postFix(String s,int n) {
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<n;i++) {
			if(Character.isDigit(s.charAt(i))) {
				stack.push(s.charAt(i)-'0');
			}else {
				int operand1=stack.pop();
				int operand2=stack.pop();
				switch(s.charAt(i)) {
				case '+' :
					stack.push(operand1+operand2);
					break;
				case '-' :
					stack.push(operand1-operand2);
					break;
					
				case '*' :
					stack.push(operand1*operand2);
					break;
					
				case '/' :
					stack.push(operand1/operand2);
					break;
				}
			    
			}
		}
		return stack.pop();
	}

}
