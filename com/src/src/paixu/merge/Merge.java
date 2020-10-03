package src.paixu.merge;

import org.junit.Test;

import java.util.Arrays;
/*
* 归并排序：
*          核心思想：分，治
*
* */
public class Merge {
    static int count = 0;

    public static void mergeSort(int[] arr, int left, int right, int[] tmp) {

        if (left < right) {
            int mid = (left + right) / 2;
            //左递归
            mergeSort(arr, left, mid, tmp);

            //右递归
            /*System.out.print("左递归结束："+left+" "+mid+" "+right);
            System.out.println();*/
            mergeSort(arr, mid + 1, right, tmp);
            /*System.out.print("右递归结束："+left+" "+mid+" "+right);
            System.out.println();*/
            merge(arr, left, mid, right, tmp);
            /*count++;
            System.out.println(count+"::"+Arrays.toString(arr));
            System.out.println(left+" "+mid+" "+right);
            System.out.println("end");
            System.out.println();*/
        }
    }
    public static void merge(int[] arr, int left, int mid, int right, int[] tmp) {
       //l指向左边第一个值
        int l = left;
        //r指向中间值的后一位
        int r = mid + 1;
        //t表示指向tmp数组的索引
        int t = 0;

        //判断条件，l=mid时中间值左边元素已全部添加到tmp数组中，r=right时，中间值右边元素已添加到tmp数组中
        while (l <= mid && r <= right) {

            //左边只小于右边值，将左边值先添加到tmp数组中，左下标l++，右下标不变，tmp索引t++
            if (arr[l] <= arr[r]) {
                tmp[t] = arr[l];
                t++;
                l++;
            }
            //右边值小于左边值，右边值添加到tmp数组中，t++，r++，l不变
            else {
                tmp[t] = arr[r];
                t++;
                r++;
            }
        }
        //右边数据添加完毕，左边仍有数据，将左边数据直接添加到tmp数组中
        while (l <= mid) {
            tmp[t] = arr[l];
            t++;
            l++;
        }
        //左边添加完毕，右边仍有数据，将右边剩下的数据添加到tmp数组中
        while (r <= right) {
            tmp[t] = arr[r];
            t++;
            r++;
        }

        //开始将tmp数组中的数据拷贝回待排序的arr数组中，拷贝长度为left~right
        //覆盖的只是从arr中取出来的left~right中数据，这些数据正是进入排序的数据
        t = 0;
        int tmpl = left;

        while (tmpl <= right) {
            arr[tmpl] = tmp[t];
            t++;
            tmpl++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
        int[] tmp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, tmp);
        System.out.println(Arrays.toString(arr));
    }

   /* @Test
    public void test1(){
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = Arrays.copyOfRange(arr1,0,arr1.length-1);

        System.out.println(Arrays.toString(arr2));
    }*/
}
