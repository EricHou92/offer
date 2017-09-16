package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N36_AppearOnce {

    //一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
    public void FindNumsAppearOnce(int[] array, int[] result) {
        /*所有所有数字相异或，则最后的结果肯定是那两个只出现一次的数字异或的结果，
        根据异或的结果1所在的最低位，把数字分成两半，每一半里都还有只出现一次的数据和成对出现的数据
        这样继续对每一半相异或则可以分别求出两个只出现一次的数字*/
        if(array==null || array.length<2)
            return;
        int temp = 0;
        for(int i=0; i<array.length; i++)
            temp ^= array[i];
        int indexOf1 = findFirstBitIs(temp);
        for(int i=0; i<array.length; i++){
            if(isBit(array[i], indexOf1)) //index位是不是1
                result[0] ^= array[i];
            else
                result[1] ^= array[i];
        }
    }

    public int findFirstBitIs(int num){
        int indexBit = 0;
        while(((num & 1)==0) && indexBit<8*4){
            num = num >> 1;
            ++indexBit;
        }
        return indexBit;
    }

    public boolean isBit(int num,int indexBit){
        num = num >> indexBit;
        return (num & 1) == 1;
    }
}
