package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/11.
 */
public class N14_ContainerMost {

    //给定n个非负整数a1，a2，...，an，其中每个表示坐标（i，ai）处的点。
    // 绘制n条垂直线，使得线i的两个端点处于（i，ai）和（i，0）。 找到两条线，它们与x轴一起形成容器，使得容器含有最多的水。
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int result = 0;
        while (low < high) {
            result = Math.max(result, Math.min(height[low], height[high]) * (high - low));
            if (height[low] < height[high])
                low++;
            else
                high--;
        }
        return result;
    }
}
