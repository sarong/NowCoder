package prepare.hwtest;

import java.math.BigDecimal;
import java.util.Scanner;
//保留一位小数
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int flag = 0;
        while (sc.hasNextInt()) {
            int temp = sc.nextInt();
            if (temp < 0) {
                count++;
            } else {
                sum += temp;
                flag++;
            }
        }
        System.out.println(count);
        if (flag < 0)
            System.out.println(0.0);
        else {
            double reslut = (double) sum / flag;
            double re = new BigDecimal(reslut).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println(re);
        }

    }
}
