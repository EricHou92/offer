package A2_Leetcode.T3_DynamicProgramming.package1;

/**
 * Created by ciciya on 2017/3/26.
 */
public class N13_BST {

    public int numTrees(int n) {
        if(n==0){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                //以这个结点为根的可行二叉树数量就是左右子树可行二叉树数量的乘积，
                //所以总的数量是将以所有结点为根的可行结果累加起来
                dp[i] += dp[j]*dp[i-1-j];
            }
        }
        return dp[n];
    }
}
