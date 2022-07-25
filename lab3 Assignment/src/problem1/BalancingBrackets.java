package problem1;

import java.util.Stack;

public class BalancingBrackets {
	static boolean findBalance(String input){
		boolean rtnValue = false;
		
		if(input.length() %2 != 0)
			return rtnValue;
		
		Stack<Character> brackets = new Stack<>();
		
		for(int index=0; index < input.length(); index++) {
			char readChar = input.charAt(index);
			
			if(readChar == '{' || readChar == '[' || readChar == '(') {
				brackets.push(readChar);
				continue;
			}
			
			if(brackets.isEmpty()){
				rtnValue = false;
				break;
			}
			if(readChar == '}') {
				char popChar = brackets.pop();
				if(popChar == '{')
					rtnValue = true;
				else {
					rtnValue= false;
					break;
				}
			}
			
			if(readChar == ']') {
				char popChar = brackets.pop();
				if(popChar == '[')
					rtnValue = true;
				else {
					rtnValue= false;
					break;
				}
			}
			
			if(readChar == ')') {
				char popChar = brackets.pop();
				if(popChar == '(')
					rtnValue = true;
				else {
					rtnValue= false;
					break;
				}
			}
		}
		return rtnValue;
	}
	public static void main(String[] args) {
		String braces = "([[{}]]";
		if(findBalance(braces)) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
