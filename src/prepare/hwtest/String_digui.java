package prepare.hwtest;

import java.util.Scanner;

/*
* 编写一个函数，传入一个int型数组，
* 返回该数组能否分成两组，使得两组中各元素加起来的和相等，
* 并且，所有5的倍数必须在其中一个组中，所有3的倍数在另一个组中
* （不包括5的倍数），能满足以上条件，返回true；不满足时返回false。
 * */
public class String_digui {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            int index = 0,sum1 = 0,sum2 = 0;
            for(int i=0;i<n;i++){
                int tmp = scanner.nextInt();
                if(tmp % 5 == 0) sum1 += tmp;
                else if (tmp % 3 == 0) sum2 += tmp;
                else nums[index++] = tmp;
            }
            System.out.println(isExists(sum1, sum2, nums, 0));
        }
        scanner.close();
    }
    public static boolean isExists(int sum1,int sum2,int[] nums,int index){
        if(index == nums.length && sum1 != sum2) return false;
        if(index == nums.length && sum1 == sum2) return true;
        if(index < nums.length) return isExists(sum1+nums[index], sum2, nums, index+1) || isExists(sum1, sum2+nums[index], nums, index+1);
        return false;
    }
}
