package prepare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        long num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                num = num / i;
                arr.add(i);
            }
        }
        for(int tmp : arr)
            System.out.println(tmp);

    }
}
