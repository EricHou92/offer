package A1_JianzhiOffer.T4_Tree;

import java.util.Arrays;

public class N4_reConstructTree {

	//输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点
	public TreeNode buildTree(int[] pre,int[] mid) {
		if(pre.length == 0 || mid.length == 0)
			return null;
		TreeNode root = new TreeNode(pre[0]);
		for (int i = 0; i < mid.length; i++) {
			if(mid[i] == pre[0]){
				root.left = buildTree(Arrays.copyOfRange(pre, 1, i+1),
						Arrays.copyOfRange(mid, 0, i));
				root.right = buildTree(Arrays.copyOfRange(pre, i+1, pre.length),
						Arrays.copyOfRange(mid, i+1, mid.length));
			}
		}
		return root;
	}
}
