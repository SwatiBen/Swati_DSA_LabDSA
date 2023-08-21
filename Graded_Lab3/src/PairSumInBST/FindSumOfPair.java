package PairSumInBST;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindSumOfPair {

	Node insertNode(Node root, int key) {
		if (root == null) {
			return new Node(key);
		}
		if (key > root.value) {
			root.right = insertNode(root.right, key);
		} else
			root.left = insertNode(root.left, key);
		return root;
	}

	void preorder(Node root) {
		Queue<Node> qobj = new LinkedList<Node>();
		qobj.add(root);
		if (root == null) {
			return;
		} else {
			qobj.add(root.left);
			preorder(root.left);
			System.out.print(root.value + " ");
			preorder(root.right);
		}
	}

	public boolean findpair(Node currentLocation, int sum, List<Integer> list) {
		if (currentLocation == null)
			return false;

		if (findpair(currentLocation.left, sum, list))
			return true;

		if (list.contains(sum - currentLocation.value)) {
			System.out.println(
					"\n\nPair is found (" + (sum - currentLocation.value) + ", " + currentLocation.value + ")");
			return true;
		} else
			list.add(currentLocation.value);

		return findpair(currentLocation.right, sum, list);
	}
}