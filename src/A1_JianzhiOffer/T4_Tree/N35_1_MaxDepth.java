package A1_JianzhiOffer.T4_Tree;

import java.util.LinkedList;

public class N35_1_MaxDepth {

	//递归实现, 二叉树深度
	public int maxDepth(TreeNode root){
		if(root == null)
			return 0;
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		return (leftDepth > rightDepth) ? leftDepth+1 : rightDepth+1;
	}

	//非递归实现, 二叉树的深度
	public int maxDepth2(TreeNode root) {
		if(root == null)
			return 0;
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int result = 0;
		while(!queue.isEmpty()) {
			int low = 0;
			int high = queue.size();
			while(low < high) {
				TreeNode node = queue.poll();
				low++;
				if(node.left != null)
					queue.offer(node.left);
				if(node.right != null)
					queue.offer(node.right);
			}
			result++;
		}
		return result;
	}
}
