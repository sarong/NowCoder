package prepare.hwtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
/*
* 上下左右移动
*
* */
public class Movess {
    public static void test(String str) {
        int x = 0;
        int y = 0;
        String[] s = str.split("[;]+");
        String pattern = "^[W|A|S|D][0-9]+";
        List<String> list = new ArrayList<>();
        for (String s1 : s) {
            if (Pattern.matches(pattern, s1)) {
                list.add(s1);
            }
        }
        for (String s2 : list) {
            /*System.out.println(s2.substring(0,1));*/
            String ss = s2.substring(0,1);
            if (ss.equals("W")) {
                y += Integer.parseInt(s2.substring(1));
            } else if (ss.equals("S")) {
                y -= Integer.parseInt(s2.substring(1));
            } else if (ss.equals("A")) {
                x -= Integer.parseInt(s2.substring(1));
            } else if (ss.equals("D")) {
                x += Integer.parseInt(s2.substring(1));
            }
        }
        System.out.println(x+","+y);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
        String s = scanner.nextLine();
        test(s);
        }
        scanner.close();
    }
}
