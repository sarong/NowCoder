package prepare;

import java.util.Scanner;
import java.util.Stack;

public class Huangtang {
    public static long solve (int n, int[] a) {
        // write code here
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
        for(int i = n-1; i>=0; i--){
            for (int j =i-1; j>=0;j--){
                if (a[j]>a[i]){
                    tmp+=j+1;
                    break;
                }
            }
        }
        return tmp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1};
        System.out.println(solve(6,arr));
    }
}
