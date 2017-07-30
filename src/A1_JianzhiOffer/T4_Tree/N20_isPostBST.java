package A1_JianzhiOffer.T4_Tree;

import java.util.Arrays;

/**
 * @author ciciya
 * BST的后序序列的合法序列，
 * 对于一个序列S，最后一个元素是x （也就是根），
 * 如果去掉最后一个元素的序列为T，
 * 那么T满足：T可以分成两段，前一段（左子树）小于x，后一段（右子树）大于x，
 * 且这两段（子树）都是合法的后序序列。完美的递归定义 。
 */
public class N20_isPostBST {

    public boolean isPostBST(int[] array) {
        if(array.length == 0)
            return false;
        int root = array[array.length-1];
        //左子树结点小于根结点
        int i;
        for(i=0; i<array.length-1; i++){
            if(array[i] > root)
                break;
        }
        //右子树结点大于根结点
        for(int j=i; j<array.length-1; j++){
            if(array[j] < root)
                return false;
        }
        boolean left = true;
        boolean right = true;
        if(i > 0)
            left = isPostBST(Arrays.copyOfRange(array, 0, i));
        if(i < array.length-1)
            right = isPostBST(Arrays.copyOfRange(array, i, array.length-1));
        return (left && right);
    }
}
