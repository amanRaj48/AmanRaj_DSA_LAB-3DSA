package com.greatLearning.DSA.client;

import java.util.Stack;

public class BalancedBrackets {

	public static boolean isBalanced(String input) {
		Stack<Character> bracketsExp = new Stack<>(); // Stack Initialisation
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == '(' || ch == '{' || ch == '[') {
				bracketsExp.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				char top = bracketsExp.pop();
				if ((ch == ']' && top != '[') || (ch == '}' && top != '{') || (ch == ')' && top != '(')) {
					return false;
				}
			}
		}
		return bracketsExp.empty();
	}
}
