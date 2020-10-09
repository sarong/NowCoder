import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        int[] sum = new int[nums1.length + nums2.length];
        int temp = 0;
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                sum[temp] = nums1[i];
                temp++;
                i++;
            } else if (nums1[i] > nums2[j]) {
                sum[temp] = nums2[j];
                temp++;
                j++;
            } else {
                sum[temp] = nums1[i];
                sum[temp + 1] = nums2[j];
                temp += 2;
                i++;
                j++;
            }
        }
        if (i <= nums1.length - 1) {
            for (int tmp = i; tmp < nums1.length; tmp++) {
                sum[temp] = nums1[tmp];
                temp++;
            }
        } else if (j <= nums2.length - 1) {
            for (int tmp1 = j; tmp1 < nums2.length; tmp1++) {
                sum[temp] = nums2[tmp1];
                temp++;
            }
        }
        System.out.println(Arrays.toString(sum));
        int len = sum.length;
        if (len % 2 == 0) {
            result = (double) (sum[len / 2] + sum[len / 2 - 1]) / 2;
        } else {
            result = sum[len / 2];
        }
        return result;
    }

    public static double solution(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int max = nums1[0];
        int temp1 = 0;
        int temp2 = 0;
        int count = 0;
        while (temp1 < len1 && temp2 < len2) {
            if (max <= nums2[temp2]) {
                max = nums2[temp2];
                temp2++;
            } else if (max <= nums1[temp1]) {
                max = nums1[temp1];
                temp1++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4};
        int[] nums2 = {};
       // double x = findMedianSortedArrays(nums1, nums2);
      //  System.out.println(x);

        double y = solution(nums1,nums2);
        System.out.println(y);
    }
}
