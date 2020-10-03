package prepare.hwtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DelStr {
    public static char[] del(String string) {
        //创建26个英文字母的数组
        char[] xyz = new char[26];
        int[] temp = new int[26];
        for (int i = 0; i < 26; i++) {
            xyz[i] = (char) (i + 97);
        }
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            for (int i = 0; i < xyz.length; i++) {
                if (xyz[i] == ch) {
                    temp[i]++;
                }
            }
        }
        //求出最小值
        int min = 26;
        for (int index = 0; index < temp.length; index++) {
            if (temp[index] < min && temp[index] > 0) {
                min = temp[index];
            }
        }
        //取出最小值等于min的所有下标
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == min)
                list.add(i);
        }
        if (list.size() > 0) {
            for (int remv : list) {
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == (char) (remv + 97)) {
                        chars[i] = '0';
                    }
                }
            }
        }
        String s = chars.toString();
        System.out.print(s);
        return chars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String s = scanner.next();
            list.add(s);
        }
        if (list!=null){
            for (String s : list){
                char[] chars = del(s);
                for (char c:chars)
                    if (c!='0')
                    System.out.print(c);
            }
        }
    }
}
