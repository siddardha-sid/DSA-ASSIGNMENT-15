package problems;

import java.util.Stack;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> st=new Stack<>();
st.push(10);
st.push(20);
st.push(30);
st.push(40);
st.push(50);
System.out.println(st);
	}
	public static Stack<Integer> reverse(Stack<Integer> st) {
		if(st.isEmpty() || st.size()==1) {
			return st;
		}
		int popped=st.pop();
		Stack<Integer> s=reverse(st);
		st.push(s.pop());
		return st;
	}

}
