package A2_Leetcode.T3_DynamicProgramming.package1;

/**
 * Created by ciciya on 2017/3/26.
 */
public class N12_1_BST {

    //给定n，存储值1 到 n的二分搜索树的数目
    public int numTrees(int n) {
        if(n==0)
            return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                dp[i] += dp[j]*dp[i-1-j];   //当前数量 = 左右子树可行二叉树数量的乘积
            }
        }
        return dp[n];
    }
}
