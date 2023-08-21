package BalancedBracket;

import java.util.Stack;

public class BalancedBracket {
	public static void main(String[] args) {

		String inputString = "([[{}]])";
		boolean result;
		result = balanceBracketImp(inputString);
		if (result)
			System.out.println("The entered String Has Balanced Brackets");
		else
			System.out.println("The entered String do not contains Balanced Brackets");
	}

	private static boolean balanceBracketImp(String inputString) {
		Stack<Character> stackObject = new Stack<Character>();

		for (int i = 0; i < inputString.length(); i++) {
			char a = inputString.charAt(i);
			if (a == '(' || a == '{' || a == '[') {
				stackObject.push(a);
				continue;
			}

			if (stackObject.isEmpty()) {
				return false;
			}
			char temp = stackObject.pop();
			
			switch (temp) {
			case ')': {

				if (a == '{' || a == '[')
					return false;
				break;
			}
			case '}': {

				if (a == '(' || a == '[')
					return false;
				break;
			}
			case ']': {
				if (a == '(' || a == '{')
					return false;
				break;
			}
			}
		}
		return (stackObject.isEmpty());
	}
}
