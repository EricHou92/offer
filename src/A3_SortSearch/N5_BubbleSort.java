package A3_SortSearch;

/**
 * Created by ciciya on 2017/3/27.
 */
public class N5_BubbleSort {

    public void bubbleSort(int[] array){
        int temp;
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){ //每一次把最大的沉到底部
                if(array[j] > array[j+1]){  //交换两数位置
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
