package ex;

import java.util.Scanner;

/*請利用 class 概念製作一個鏈結串列，讓使用者可以輸入資料並尋找
 * Date: 2016/12/12
 * Author: 105021038 傅琬鈞
 */
public class ex03 {
	private static Bintree bTree;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char contChar = 'Y';
		char contChar1 = 'N';
		float v1 = 0;
		boolean flag = true;
		while (contChar == 'Y' || contChar == 'y') {
			flag = true;
			System.out.println("number");
			v1 = scn.nextFloat();
			if (bTree == null) {
				bTree = new Bintree(v1);
			} else {
				bTree.addNode(v1);

			}
			bTree.inOrder(bTree.root);
			System.out.println("continue?");
			contChar = scn.next().charAt(0);
		}
		while (contChar == 'N' || contChar == 'n') {
			break;
		}
	}
}

class Bintree {
	public static Node root;

	public Bintree(float v1) {
		root = new Node(v1);
	}

	public void addNode(float v1) {
		Node tmpNode = root;
		while (true) {
			if (v1 < tmpNode.getVal()) {
				if (tmpNode.getLeftNode() == null) {
					tmpNode.addLeftNode(v1);
					break;
				} else {
					tmpNode = tmpNode.getLeftNode();
					continue;
				}
			} else {
				if (tmpNode.getRightNode() == null) {
					tmpNode.addRightNode(v1);
					break;
				} else {
					tmpNode = tmpNode.getRightNode();
					continue;
				}
			}
		}
	}

	public void inOrder(Node node) {
		if (node.getLeftNode() != null) {
			inOrder(node.getLeftNode());
		}
		System.out.print(node.getVal() + "\t");
		if (node.getRightNode() != null) {
			inOrder(node.getRightNode());
		}
	}

	class Node {
		private Node left, right;
		private float data;

		public Node(float val) {
			this.data = val;
			this.left = null;
			this.right = null;
		}

		public float getVal() {
			return this.data;
		}

		public Node getLeftNode() {
			return this.left;
		}

		public Node getRightNode() {
			return this.right;
		}

		public void addLeftNode(float v1) {
			this.left = new Node(v1);
		}

		public void addRightNode(float v1) {
			this.right = new Node(v1);
		}
	}
}
