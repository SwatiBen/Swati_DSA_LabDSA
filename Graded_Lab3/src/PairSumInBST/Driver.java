package PairSumInBST;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		Node root = null;
		FindSumOfPair findSum = new FindSumOfPair();
		root = findSum.insertNode(root, 40);
		root = findSum.insertNode(root, 20);
		root = findSum.insertNode(root, 60);
		root = findSum.insertNode(root, 10);
		root = findSum.insertNode(root, 30);
		root = findSum.insertNode(root, 50);
		root = findSum.insertNode(root, 70);
		findSum.preorder(root);
		int sum = 130;
		List<Integer> list = new ArrayList<>();
		if (!findSum.findpair(root, sum, list))
			System.out.println("Pairs do not exit");
	}
}