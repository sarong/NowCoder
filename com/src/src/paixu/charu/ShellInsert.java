package src.paixu.charu;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShellInsert {

    public static void solution1(int[] arr){
        int temp = 0;
        for(int tag=arr.length/2;tag>0;tag/=2){
        //直接交换
        for(int i = tag;i<arr.length;i++){
            for(int j = i-tag;j>=0;j-=tag){
                if(arr[j]>arr[j+tag]){
                    temp = arr[j];
                    arr[j] = arr[j+tag];
                    arr[j+tag] = temp;
                }
            }
        }
        }

    }
    public static void solution2(int[] arr){
        int count = 0;
        for(int tag=arr.length/2;tag>0;tag/=2){
            //对每个分组进行直接插入排序
            for(int i = tag;i<arr.length;i++){
                int insertIndex = i;
                int insertValue = arr[i];
                if(arr[insertIndex]<arr[insertIndex-tag]){
                    while(insertIndex-tag>=0&&insertValue<arr[insertIndex-tag]){
                        arr[insertIndex] = arr[insertIndex-tag];
                        insertIndex-=tag;
                    }
                    arr[insertIndex] = insertValue;

                }

            }
          /*  count++;
            System.out.println("第"+count+"次："+Arrays.toString(arr));*/
        }
    }
    @Test
    public void solution3(){
        /*int[] arr = {2,5,3,6,8,1,9,0,7};*/
        int[] arr = new int[10000000];
        for(int i = 0;i<10000000;i++){
            arr[i] = (int)(Math.random()*10000000);
        }
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        Date date1 = new Date();
        System.out.println(simple.format(date1));

         solution2(arr);
        Date date2 = new Date();
        System.out.println(simple.format(date2));
       /* System.out.println();
        System.out.println(Arrays.toString(arr));*/
       /* for(int tmp:arr)
            System.out.println();*/
    }
}
