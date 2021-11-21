package com.bridgelabz.binarysearchtree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<Integer> binaryTree = new BinarySearchTree<>();
		
		binaryTree.add(56);

		binaryTree.add(30);
		binaryTree.add(70);
		
		binaryTree.add(22);
		binaryTree.add(40);
		
		binaryTree.add(60);
		binaryTree.add(95);
		
		binaryTree.inOrder();

	}

}
