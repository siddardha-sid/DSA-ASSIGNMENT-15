package problems;

import java.util.Stack;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="GeeksforGeeks";
System.out.println(reverse(s,s.length()));;
	}
	
	public static String reverse(String s,int n) {
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<n;i++) {
			stack.push(s.charAt(i));
		}
		String reverse="";
		while(!stack.isEmpty()) {
			reverse=reverse+stack.pop();
		}
		return reverse;
	}

}
