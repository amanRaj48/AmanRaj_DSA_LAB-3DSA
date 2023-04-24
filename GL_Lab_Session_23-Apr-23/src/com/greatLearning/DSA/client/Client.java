package com.greatLearning.DSA.client;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input : ");
		String expression = sc.next();
		boolean result = BalancedBrackets.isBalanced(expression);
		System.out.println("The expression is balanced ? : " + result);
		sc.close();
	}

}
