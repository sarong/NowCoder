package src.paixu.kuaipai;

import java.util.Arrays;

public class MyQuikSort {

    public static int[] quickSort(int[] arr, int low, int high) {
        //轴心点
        int index = low;
        int cur = index + 1;//存储指数
        int temp = arr[index];
        //从index+1开始遍历
        for (int i = index + 1; i < high; i++) {
            if (arr[i] < temp) {
                int tmp = arr[i];
                arr[i] = arr[cur];
                arr[cur] = tmp;
                cur++;
            }
        }
        arr[index] = arr[cur-1];
        arr[cur-1] = temp;

        System.out.println(cur);
        if (cur <= high)
            quickSort(arr, index + 1, cur);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println(Arrays.toString(arr));
        int arrs[] = quickSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arrs));
        /*int brr[] = quickSort(arrs, 2, arrs.length);
        System.out.println(Arrays.toString(brr));
        System.out.println(Arrays.toString(quickSort(brr,2,arr.length)));*/
    }
}
