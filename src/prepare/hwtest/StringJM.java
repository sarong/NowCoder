package prepare.hwtest;

import java.util.Arrays;
import java.util.Scanner;

public class StringJM {
    public static String enCrypt(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                if (ch[i] == '9')
                    ch[i] = '0';
                else
                    ch[i] = (char) (ch[i] + 1);
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                if (ch[i] != 'z')
                    ch[i] = (char) (ch[i] + 1 - 32);    //a-z转换为加一大写
                else
                    ch[i] = 'A';
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                if (ch[i] != 'Z')
                    ch[i] = (char) (ch[i] + 1 + 32);
                else
                    ch[i] = 'a';
            } else continue;
        }
        return new String(ch);
    }

    public static String unEncrypt(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                if (ch[i] == '0')
                    ch[i] = '9';
                else
                    ch[i] = (char) (ch[i] - 1);
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                if (ch[i] != 'a')
                    ch[i] = (char) (ch[i] - 1 - 32);    //a-z转换为减一大写
                else
                    ch[i] = 'Z';
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                if (ch[i] != 'A')
                    ch[i] = (char) (ch[i] - 1 + 32);
                else
                    ch[i] = 'z';
            } else continue;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(enCrypt(str1));
            System.out.println(unEncrypt(str2));
        }
        scanner.close();
    }
}
