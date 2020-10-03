package src.paixu.charu;

import java.util.Arrays;

/*
*插入排序：
*   1）把n个待排元素分为有序表和有序表，开始时有序表中只有一个元素，arr[0]，无序表中有n-1个元素，arr[1]~arr[n-1]
*   2）将arr[1]插入到有序表中,是有序表仍然有序，此时有序表元素数为2，无序表元素数为n-2
*   3）循环进行步骤二，每次把无序表中的第一个元素arr[i]插入到有序表中，直至所有元素都在有序表中，此时排序完成
* */
public class Inserts {

    public static void solution(int[] arr){
        int insertValue = 0;
        int insertIndex = 0;


        //从第二个元素开始插入
        for(int i= 1;i<arr.length;i++){
            //待插入元素
            insertValue = arr[i];
            //有序表中的最后一个元素
            insertIndex = i-1;
            //插入元素；
            //升序排列，当待插入元素大于有序表中的某个数arr[index]时，将其插入这个后面，即，arr[index+1]=insertValue
            //注意数组越界，当insertIndex=0时，即将待插入元素放在数据第一位
            while(insertIndex>=0&&insertValue<arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            //insertIndex+1=i，则说明不用待插入元素arr[i]大于有序表最后一个元素arr[i-1],不用做交换，直接进行下一次循环
            if(insertIndex+1!=i){
                arr[insertIndex+1] = insertValue;
            }
        }
    }
/*
    public static void insert(int[]arr, int num){
        for(int i = arr.length-1;i>0;i--){
            if(num>arr[i]){
                for(int j =arr.length;j>i+1;j--){
                    arr[j] = arr[j-1];
                }
                arr[i+1] = num;
            }
        }
    }*/
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,4,66,8,9};
        solution(arr);

        System.out.println(Arrays.toString(arr));
        for(int arr1:arr)
            System.out.print(arr1);
    }
}
