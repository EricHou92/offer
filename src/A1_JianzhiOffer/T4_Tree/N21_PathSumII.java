package A1_JianzhiOffer.T4_Tree;

import java.util.LinkedList;
import java.util.List;

public class N21_PathSumII {
	public List<List<Integer>> pathSumII(TreeNode root, int sum){
		List<Integer> list  = new LinkedList<>();
		List<List<Integer>> allList  = new LinkedList<>();
		pathSum(root, sum, list, allList);
		return allList;
	}

	public void pathSum(TreeNode root, int sum, List<Integer> list, List<List<Integer>> allList) {
		if (root == null)
			return;
		list.add(root.val);
		if (root.left == null && root.right == null && sum == root.val) {
			allList.add(new LinkedList(list));
			list.remove(list.size() - 1);  //don't forget to remove the last integer
			return;
		} else {
			pathSum(root.left, sum - root.val, list, allList);
			pathSum(root.right, sum - root.val, list, allList);
		}
		list.remove(list.size() - 1);
	}
}
