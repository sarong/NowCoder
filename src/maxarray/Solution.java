package maxarray;

/*
 * 找出最大子数组：
 *       思路：对于每一个数来说，可以选择和前面的数之和相加或者自立门户
 *            如sum+arr[i]>arr[i],则相加，否则则arr[i]开始向后相加
 *
 *
 * */
public class Solution {
    public int maxSubArray(int[] arr) {
        int max = arr[0];
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            if (sum + arr[i] < arr[i]) {
                sum = 0;
            }
            sum += arr[i];
            if(sum > max){
                max = sum;
            }

        }
        return max;
    }
}
