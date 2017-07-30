package A2_Leetcode.T6_BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class N56_2_PrintZ {

	public List<List<Integer>> ZLevelOrder(TreeNode root) {
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
		List<Integer> collection  = result.get(level);
		if(level % 2 == 0)
			collection.add(root.val);
		else
			collection.add(0, root.val);
		travel(root.left, result, level + 1);
		travel(root.right, result, level + 1);
	}
}
