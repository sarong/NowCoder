package prepare;

import java.util.Arrays;

public class Xiaoxile {
    public static long minimumValueAfterDispel(int[] nums) {
    long sum = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j<nums.length;j++){
                nums[j]-=i;
            }
        }
        /*long count = 0;
        int flag1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) flag1++;
            count += nums[i];
        }
        int avl = (int) (count / flag1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= avl) {
                nums[i] -= avl;
            }
        }
        System.out.println(Arrays.toString(nums));
        long temp = 0;
        int flag2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) flag2++;
            temp += nums[i];
        }
        int avl1 = (int) (temp / flag2);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= avl1) {
                nums[i] -= avl1;
            }
        }
        System.out.println(Arrays.toString(nums));
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;*/
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {9, 1, 2, 7, 2, 1, 6, 0, 1, 8};
        System.out.println(minimumValueAfterDispel(arr));
    }
}
