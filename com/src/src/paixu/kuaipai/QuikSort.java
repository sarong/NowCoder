package src.paixu.kuaipai;

import java.util.Arrays;

/*
 * 快速排序：
 *       对冒泡排序的一种改进，基本思想是：通过一趟排序将要排序的数据分割成两部分，其中一部分数据比另外一部分的数据都要小，然后再按此方法对这两部分数据继续快速排序
 *   1）从两边向中间值查找，找到一直找到左边arr[l]>tmp，右边arr[r]<tmp
 *   2）将找到的两个值互换，即做到了左边小于tmp，右边大于tmp;
 *   3)对左边和右边递归调用前两步，直到左右全部判断完成，即可得到有序序列
 *
 * */
public class QuikSort {
    public static void quickSort(int[] arr, int left, int right) {
        //取中间值
        int mid = (left + right) / 2;
        int tmp = arr[mid];

        int l = left;
        int r = right;
        int temp = 0;
        /*
         *  1)左大于中，移动到arr[mid]右侧
         *  2）右小于中，移动到arr[mid]左侧
         *
         * */
        while (l < r) {
            while (arr[l] < tmp) {
                l++;
            }
            while (arr[r] > tmp) {
                r--;
            }
            if (l >= r) {
                break;
            }

            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if (arr[l] == tmp) {
                r--;
            }

            if (arr[r] == tmp) {
                l++;
            }

           /* if (l == r) {
                l++;
                r--;
            }*/

            if (left < r) {
                quickSort(arr, left, r);
            }

            if (right > l) {
                quickSort(arr, l, right);
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 10, 8, 22, 34, 13,-1,33,-2,-99};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
