package A2_Leetcode.T6_BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class N56_2_PrintZ {

	//给你二叉树的根节点root，返回其节点值的锯齿形层序遍历 （即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		travel(root, result, 0);
		return result;
	}

	private void travel(TreeNode root, List<List<Integer>> result, int level){
		if(root == null)
			return;
		if(result.size() <= level) {
			List<Integer> list = new LinkedList<>();
			result.add(list);
		}
		List<Integer> list1  = result.get(level);
		if(level % 2 == 0)
			list1.add(root.val);
		else
			list1.add(0, root.val);
		travel(root.left, result, level + 1);
		travel(root.right, result, level + 1);
	}
}
