package com.bridgelabz.binarysearchtree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BinarySearchTree<Integer> binary_Tree = new BinarySearchTree<>();

		binary_Tree.add(56);

		binary_Tree.add(30);
		binary_Tree.add(70);
		binary_Tree.add(22);
		binary_Tree.add(40);
		binary_Tree.add(11);
		binary_Tree.add(3);
		binary_Tree.add(16);
		binary_Tree.add(60);
		binary_Tree.add(95);
		binary_Tree.add(65);
		binary_Tree.add(63);
		binary_Tree.add(67);

		System.out.println("Enter 1 : For inOrder Binary tree \n Enter 2 : For pre order Binary tree \n Enter 3: For post order Binary tree");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch (num) {

		case 1:
			binary_Tree.inOrder();
			break;
		case 2:
			binary_Tree.preOrder();
			break;
		case 3:
			binary_Tree.postOrder();
			break;
		default:
			System.out.println("Enter valid Number ");
		}

	}

}
