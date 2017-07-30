package A2_Leetcode.T5_DepthFirstSearch.package1;

/**
 * Created by ciciya on 2017/5/4.
 */
public class N11_FriendCircle {

    /*声明一个visited，用于记录遍历过的结点。
    每次dfs找到一个原矩阵为1的位置，就把这个位置的列数变成行数再dfs，
    如果是在同一个圈里，最终会绕回已经遍历过的行；如果不是同一个圈，则增加1*/

    public static void main(String[] args){
        int[][] M = {{1,1,0},{1,1,1},{0,1,1}};
        int result = new N11_FriendCircle().findCircleNum(M);
        System.out.println(result);
    }

    public int findCircleNum(int[][] M) {
        boolean[] visited = new boolean[M.length]; //默认false
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (!visited[i]) {  //visited[i]为0，表示未访问
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    public void dfs(int[][] M, boolean[] visited, int i) {
        for (int j=0; j<M.length; j++) {
            if (M[i][j] == 1 && !visited[j]) {
                visited[j] = true; //visited[i]为1，标记为已访问
                dfs(M, visited, j);
            }
        }
    }
}
