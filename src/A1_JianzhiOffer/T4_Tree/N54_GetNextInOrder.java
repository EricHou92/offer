package A1_JianzhiOffer.T4_Tree;

/**
 * @author ciciya
 * 分析二叉树的下一个节点，一共有以下情况：
1.二叉树为空，则返回空;
2.节点右孩子存在，则设置一个指针从该节点的右孩子出发，
一直沿着指向左子结点的指针找到的叶子节点即为下一个节点；
3.节点不是根节点。如果该节点是其父节点的左孩子，则返回父节点；
否则继续向上遍历其父节点的父节点，重复之前的判断，返回结果。
 */
public class N54_GetNextInOrder {
	public TreeLinkNode GetNext(TreeLinkNode node) {
		//二叉树为空
		if(node == null)
			return null;
		//节点右孩子存在
		if(node.right != null){
			node = node.right;
			while(node.left != null)
				node = node.left;
			return node;
		}
		//节点右孩子不存在
		while(node.parent != null){
			if(node.parent.left == node)
				return node.parent;
			node = node.parent;
		}
		return null;
	}


	class TreeLinkNode {
		int val;
		TreeLinkNode left;
		TreeLinkNode right;
		TreeLinkNode parent;
		TreeLinkNode(int val) {
			this.val = val;
		}
	}
}
