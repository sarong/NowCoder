import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
* 在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）
例子:
输入: N = 1, K = 1
输出: 0
输入: N = 2, K = 1
输出: 0
输入: N = 2, K = 2
输出: 1
输入: N = 4, K = 5
输出: 1
解释:
第一行: 0
第二行: 01
第三行: 0110
第四行: 01101001
* */
public class KthGrammar {
    static int count = 0;

    public static int kthGrammar(int N, int K) {
        String str = temp(N);
        //System.out.println(str);
        char[] chars = str.toCharArray();
       return Integer.parseInt(String.valueOf(chars[K - 1]));

        //return chars[K-1];
    }

    List<String> list = new ArrayList<>();

    public static String temp(int n) {
        if (n == 1)
            return new String("0");
        else
            return temp(n - 1) + exchange(temp(n - 1));
       /* String string = "0";
        if (n == 1)
            return string;
        for (int i = 2; i <= n; i++){
            string+=exchange(string);
        }
        return string;*/
    }

    public static String exchange(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0')
                chars[i] = '1';
            else if (chars[i] == '1')
                chars[i] = '0';
        }
        return new String(chars);
    }

    public static void main(String[] args) {
       /* String strs = "0110";
        System.out.println(exchange(strs));*/
        Date date = new Date();
        System.out.println(date);
        System.out.println(kthGrammar(30, 434991989));
        Date date1 = new Date();
        System.out.println(date1);

    }
}
