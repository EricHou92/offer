package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N34_TimesOfK {

    //二分查找改进
    public  int GetNumberOfK(int[] array, int k){
        if(array==null || array.length==0)
            return 0;
        int first = getFirstK(array, 0, array.length-1, k);
        int last = getLastK(array, 0, array.length-1, k);
        if(first == -1 || last == -1)
            return 0;
        else
            return last-first+1;
    }

    public int getFirstK(int[] array, int low, int high, int k){
        while(low<=high){
            int mid = (low+high)/2;
            if(k<array[mid])
                high = mid-1;
            else if(k>array[mid])
                low = mid+1;
            else{
                if((mid>0 && array[mid-1]!=k) || mid==0)
                    return mid;
                else
                    high = mid-1;
            }
        }
        return -1;
    }

    public int getLastK(int[] array, int low, int high, int k){
        while(low<=high){
            int mid = (low+high)/2;
            if(k<array[mid])
                high = mid-1;
            else if(k>array[mid])
                low = mid+1;
            else{
                if((mid<array.length-1 && array[mid+1]!=k) || mid==array.length-1)
                    return mid;
                else
                    low = mid+1;
            }
        }
        return -1;
    }
}
