package prepare.hwtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eight {

    public static void getSt(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        while (stringBuffer.length() >= 8) {
            System.out.println(stringBuffer.substring(0, 8));
            stringBuffer = stringBuffer.delete(0, 8);
        }
        if (stringBuffer.length() != 0) {
            stringBuffer.append("00000000");
            System.out.println(stringBuffer.substring(0, 8));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = new String();
        while (in.hasNext()) {
            int sum = in.nextInt();
            for (int i = 0; i < sum; i++) {
                String str1 = in.next();
                getSt(str1);
            }
        }
    }
}
