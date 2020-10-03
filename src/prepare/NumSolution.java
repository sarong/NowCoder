package prepare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
* 汽水瓶问题，一共能喝多少瓶
* */
public class NumSolution {

    public static int mySolu(int num) {
        int count = 0;//一共能喝多少瓶
        while (num > 1) {
            if (num >= 3) {
                count += num / 3;
                num = num / 3 + num % 3;

            } else {
                num = 1;
                count += num;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0)
                break;
            list.add(mySolu(num));
        }
        for (Integer l : list)
            System.out.println(l);
    }
}
