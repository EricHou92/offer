package A1_JianzhiOffer.T4_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//二叉树层序遍历,广度优先搜索BFS
public class N19_TreeBFS {

	public List<Integer> TreeBFS(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root == null)
			return list;
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
            list.add(node.val);
        }
		return list;
	}
}
