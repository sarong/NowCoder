package src.paixu.xuanze;
/*
* 排序算法思想：
*   1）设当前元素min=arr[i]为最小值
*   2）以当前元素的下一元素arr[j=i+1]为起点，遍历后续元素，与最小值min比较，
*       如arr[j]比min小，则交换arr[j]和arr[i]的值
*   3) 当前循环结束，进入i+1次循环，此时先将arr[i+1]设为最小值再与后续元素比较
*   4）时间复杂度：
*       最好情况和最坏情况下复杂度都为O(n^2)，平均算法复杂度也为O(n^2)
*      空间复杂度：
*           O(1)
* */
public class Select {

    public void solution(int[] arr){

        for(int i = 0;i < arr.length;i++){
            //设当前元素为最小值
            int min = arr[i];
            //tmp记录最小值的节点
            int tmp = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<min){
                        //arr[j]<min，将min值更新为arr[j]
                        min = arr[j];
                        //记录min下标
                        tmp = j;
                }
            }
            //第i次循环结束，交换arr[i]和arr[j]的值，进入第i+1次循环
            arr[tmp] = arr[i];
            arr[i] = min;
        }
    }
}

class Main{
    public static void main(String[] args) {
        int[] arr = {1,5,4,3,6,7,9,8};

        Select select = new Select();
        select.solution(arr);
        for(int arrs:arr)
            System.out.print(arrs+"  ");
    }
}