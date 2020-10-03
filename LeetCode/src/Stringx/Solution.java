package Stringx;

import org.junit.Test;

public class Solution<num2, num1> {
    /*public void solution(String num1,String num2){
        //遍历，每一位相乘
        for(int i=0;i<)
        long num3=(num1.charAt(0)-'0')*(num2.charAt(0)-'0');
        System.out.println(num3);
    }
}

class Main{
    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.solution("5","6");
    }*/
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
        System.out.println(multiply("25", "15645"));
    }

    public static String multiply(String num1, String num2) {
        char[] value = new char[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                value[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        // 处理进位
        int carry = 0;
        for (int i = value.length - 1; i >= 0; i--) {
            value[i] += carry;
            carry = value[i] / 10;
            value[i] %= 10;
        }
        // 处理前端的 0
        int beginIndex = 0;
        while (beginIndex < value.length - 1 && value[beginIndex] == 0) {
            beginIndex++;
        }
        for (int i = beginIndex; i < value.length; i++) {
            value[i] += '0';
        }
        return new String(value, beginIndex, value.length - beginIndex);
    }
}