package com.greatLearning.DSA.client;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class BinarySearchTree {

	private Node root;

	private static class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int value) {
		root = insert(root, value);
	}

	private Node insert(Node node, int value) {
		if (node == null) {
			// root node
			return new Node(value);
		}
		if (value < node.value) {
			node.left = insert(node.left, value);
		}
		if (value > node.value) {
			node.right = insert(node.right, value);
		}
		return node;
	}

	public boolean findPairWithSum(int sum) {
		Set<Integer> set = new HashSet<>();
		return findPairWithSum(root, sum, set);
	}

	private boolean findPairWithSum(Node node, int sum, Set<Integer> set) {
		if (node == null) {
			return false;
		}
		if (findPairWithSum(node.left, sum, set)) {
			return true;
		}
		if (set.contains(sum - node.value)) {
			System.out.println("Pair found :: (" + (sum - node.value) + " , " + node.value + ")");
			return true;
		}
		set.add(node.value);
		return findPairWithSum(node.right, sum, set);
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(60);
		tree.insert(70);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum value for which you want the pair ? : ");
		int sum = sc.nextInt();
		sc.close();

		if (!tree.findPairWithSum(sum)) {
			System.out.println("Nodes are not found for sum " + sum);
		}

	}
}
