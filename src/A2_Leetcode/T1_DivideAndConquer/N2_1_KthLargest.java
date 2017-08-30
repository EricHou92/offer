package A2_Leetcode.T1_DivideAndConquer;

import java.util.Random;
import java.util.Scanner;

public class N2_1_KthLargest {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            String[] strings = string.split(" ");
            int[] nums = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                nums[i] = Integer.parseInt(strings[i]);
            }
            int k = scanner.nextInt();
            System.out.println(findKthLargest(nums, k));
        }
    }

    public static int findKthLargest(int[] nums, int k) {
        shuffle(nums);
        k = nums.length - k;
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = partition(nums, low, high);
            if(mid < k) {
                low = mid + 1;
            } else if (mid > k) {
                high = mid - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    private static void shuffle(int[] nums) {
        Random random = new Random();
        for(int i=1; i<nums.length; i++) {
            int r = random.nextInt(i + 1);
            exchange(nums, i, r);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int i = low;
        int j = high + 1;
        while(true) {
            while(i < high && less(nums[++i], nums[low]));
            while(j > low && less(nums[low], nums[--j]));
            if(i >= j) {
                break;
            }
            exchange(nums, i, j);
        }
        exchange(nums, low, j);
        return j;
    }

    private static void exchange(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private static boolean less(int i, int j) {
        return i < j;
    }

}
