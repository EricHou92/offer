package A1_JianzhiOffer.T4_Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class N58_GetSerialize {

	//请实现两个函数，分别用来序列化和反序列化二叉树
	public String serialize(TreeNode root) {
		if(root == null){
			return "null,";
		}
		String res = root.val + ",";
		res += serialize(root.left);
		res += serialize(root.right);
		return res;
	}

	public TreeNode deserialize(String data) {
		String[] strings = data.split(",");
		List<String> list = new LinkedList<>(Arrays.asList(strings));
		return helper(list);
	}

	public TreeNode helper(List<String> list) {
		if (list.get(0).equals("null")) {
			list.remove(0);
			return null;
		}
		TreeNode root = new TreeNode(Integer.parseInt(list.get(0)));
		list.remove(0);
		root.left = helper(list);
		root.right = helper(list);
		return root;
	}
}
