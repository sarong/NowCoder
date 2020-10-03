package prepare;

import java.util.*;
/*
* 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
* */
public class NewNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();
        String str = num.toString();
        char[] ch = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = ch.length - 1; i >= 0; i--){
            if (!list.contains(ch[i]))
                list.add(ch[i]);
        }
        String str1 = new String();
        for (Character entry:list){
            str1+=entry;
        }
        System.out.println(Integer.parseInt(str1));
    }
}
