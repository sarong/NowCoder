package prepare;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //进制转换，16进制转换为10进制
    public static void solution1() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(Integer.valueOf(str.substring(2), 16).toString());
        }
    }

    //荒唐度
    public static long solve(int n, int[] a) {
        long tmp = 0;
      /*  Stack<Integer> stack = new Stack<>();
        for(int i = 0;i < n; i++){
            while (!stack.isEmpty()&&a[i]>=a[stack.peek()]){
                stack.pop();
            }
            if (!stack.isEmpty())
                tmp+=stack.peek()+1;
            stack.push(i);
        }
*/
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[i]) {
                    tmp += j + 1;
                    break;
                }
            }
        }
        return tmp;
    }

    //消消乐
    public long minimumValueAfterDispel(int[] nums) {
        // write code here
        int max_1 = nums[0];
        int max_3;
        int max_2;
        int max_4;
        long sums = 0;
        int nums_length = nums.length;
        long min = Long.MAX_VALUE;
        int[] nums_1 = new int[nums_length];
        int[] nums_2 = new int[nums_length];
        for (int i = 1; i < nums_length; i++) {
            if (max_1 < nums[i]) {
                max_1 = nums[i];
            }
        }
        // int max_2=(int)(max_1/2)+1;
        max_2 = max_1;
        for (int i = 1; i <= max_2; i++) {
            for (int j = 0; j < nums_length; j++) {
                if (nums[j] >= i) {
                    nums_1[j] = nums[j] - i;
                } else {
                    nums_1[j] = nums[j];
                }
            }
            max_3 = nums_1[0];
            for (int k = 1; k < nums_length; k++) {
                if (max_3 < nums_1[k]) {
                    max_3 = nums_1[k];
                }
            }
            //int max_4=(int)(max_3/2)+1;
            max_4 = max_3;
            for (int m = 1; m <= max_4; m++) {
                sums = 0;
                for (int j = 0; j < nums_length; j++) {
                    if (nums_1[j] >= m) {
                        nums_2[j] = nums_1[j] - m;
                    } else {
                        nums_2[j] = nums_1[j];
                    }
                    sums = sums + nums_2[j];
                }
                if (sums < min) {
                    min = sums;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        solution1();
    }
}
