package com.bridgelabz.binarysearchtree;

public class BinarySearchTree<K extends Comparable<K>> {
	
private MyBinaryNode<K> root;
	
	int count=0;
	
	public void add(K key) {
		
		this.root = this.addRecursive(root, key);
	}

	private MyBinaryNode<K> addRecursive(MyBinaryNode<K> root, K key) {
		
		if(root == null) {
			return new MyBinaryNode<>(key);
		}
		int comRes = key.compareTo(root.key);
		if(comRes == 0) {
			return root;
		}
		if(comRes < 0) {
			root.left = addRecursive(root.left, key);
		}else {
			root.right = addRecursive(root.right, key);
		}
		return root;
	}
	
	public void inOrder() {
		
		inOrderRec(this.root);
	}
	private void inOrderRec(MyBinaryNode<K> root) {
		if(root != null) {

			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);

		}
	}
	
	public void preOrder() {

		preOrderRec(this.root);
	}

	private void preOrderRec(MyBinaryNode<K> root2) {
		
		if (root != null) {

			System.out.println(root.key);

			inOrderRec(root.left);
			inOrderRec(root.right);

		}

	}

	public void postOrder() {

		postOrderRec(this.root);
	}

	private void postOrderRec(MyBinaryNode<K> root2) {
		
		if (root != null) {

			System.out.println(root.key);

			inOrderRec(root.left);
			inOrderRec(root.right);
			System.out.println(root.key);

		}

	}

}
