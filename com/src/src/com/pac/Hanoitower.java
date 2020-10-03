package src.com.pac;
/*
* 分支问题解决汉诺塔问题的策略：
* 1）如只有一个盘，直接将盘移动至C塔；
* 2）A塔中共有num个盘，将num上面所有的盘，即num-1个盘全部移动到B塔；
* 3）第2步结束之后，将最下面的盘移动到C盘；
* 4）第3步结束之后，将B塔中所有的盘移动到C盘；
* 5）重复以上步骤，直到A塔中只有一个盘，移动到C塔结束
*
* */
public class Hanoitower {
    static long count = 0;
    public static void hanoitower(int num, char a, char b, char c) {
        count ++;
        //只有一个盘
        if (num == 1){

        }
        else {
            //一共分为两个盘，最下面的盘num，和num上面所有的盘num-1，
            hanoitower(num - 1, a, c, b);
            hanoitower(num - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        hanoitower(31, 'A', 'B', 'C');
        System.out.println(count);
    }
}
