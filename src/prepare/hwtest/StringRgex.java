package prepare.hwtest;

import java.util.Scanner;
/*
* 正则表达式
* */
public class StringRgex {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String regex = sc.next();
            String s = sc.next();
            regex = regex.replaceAll("\\?", "[\\\\w]{1}");
            regex = regex.replaceAll("\\*", "[\\\\w]*");
            System.out.println(s.matches(regex));
        }
        sc.close();
    }
}
