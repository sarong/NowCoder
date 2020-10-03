package src.paixu.heap;

import java.util.Arrays;

/*
* 堆排序：
*       1）构建一个大顶堆（升序）或小顶堆（降序）
*           a）从最后一个非叶子节点开始，从左至右，从上至下调整
*           b）找到第二个非叶子节点，继续比较，始终保持父节点大于左右节点的值（先比较左右节点，取最大值和父节点比较）
*       2）将堆顶元素和最后一个元素互换
*       3）弹出最后一个元素
*       4）继续循环执行前三步，直到数组中只剩下一个元素
*
*
* */
public class HeapSort {

    public static void heapS(int[] arr) {
        int tmp = 0;

        /*addHead(arr,1,arr.length);
        System.out.println(Arrays.toString(arr));
        addHead(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));*/
        for(int i = arr.length/2 - 1; i >= 0; i--){
            addHead(arr,i,arr.length);
        }
        System.out.println(Arrays.toString(arr));
        for(int i =arr.length-1;i>0;i--){

            tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            addHead(arr,0,i);
        }
       // System.out.println(Arrays.toString(arr));
    }

    //arr：待排序的数组
    //i：非叶子节点的索引
    //length：待排列元素的个数，length是逐渐减少的
    public static void addHead(int[] arr, int i, int length) {
        //保存当前节点的值
        int tmp = arr[i];


        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
            //右节点大于左节点，k指向右节点
            if (k + 1 < length && arr[k] < arr[k + 1]) {
                k++;
            }
            //左/右节点值大于父结点的值，交换
            if (arr[k] > tmp) {
                arr[i] = arr[k];
                i = k;
            }else {
                break;
            }

        }
        arr[i] = tmp;
        System.out.println("待排列数组："+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {4,6,8,5,9,10,15,13,12};
        /*Date date1 = new Date();
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simple.format(date1));*/
        heapS(arr);
        System.out.println(Arrays.toString(arr));
        /*Date date2 = new Date();
        System.out.println(simple.format(date2));*/
    }
}
