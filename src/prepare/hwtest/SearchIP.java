package prepare.hwtest;

import org.junit.Test;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
/*
* 常用正则表达式
* 数字：^[0-9]*$
n位的数字：^\d{n}$
至少n位的数字：^\d{n,}$
m-n位的数字：^\d{m,n}$
零和非零开头的数字：^(0|[1-9][0-9]*)$
非零开头的最多带两位小数的数字：^([1-9][0-9]*)+(.[0-9]{1,2})?$
带1-2位小数的正数或负数：^(\-)?\d+(\.\d{1,2})?$
正数、负数、和小数：^(\-|\+)?\d+(\.\d+)?$
有两位小数的正实数：^[0-9]+(.[0-9]{2})?$
有1~3位小数的正实数：^[0-9]+(.[0-9]{1,3})?$
非零的正整数：^[1-9]\d*$ 或 ^([1-9][0-9]*){1,3}$ 或 ^\+?[1-9][0-9]*$
非零的负整数：^\-[1-9][]0-9″*$ 或 ^-[1-9]\d*$
非负整数：^\d+$ 或 ^[1-9]\d*|0$
非正整数：^-[1-9]\d*|0$ 或 ^((-\d+)|(0+))$
非负浮点数：^\d+(\.\d+)?$ 或 ^[1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0$
非正浮点数：^((-\d+(\.\d+)?)|(0+(\.0+)?))$ 或 ^(-([1-9]\d*\.\d*|0\.\d*[1-9]\d*))|0?\.0+|0$
正浮点数：^[1-9]\d*\.\d*|0\.\d*[1-9]\d*$ 或 ^(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*))$
负浮点数：^-([1-9]\d*\.\d*|0\.\d*[1-9]\d*)$ 或 ^(-(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*)))$
浮点数：^(-?\d+)(\.\d+)?$ 或 ^-?([1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0)$
*
* 校验字符的表达式
汉字：^[\u4e00-\u9fa5]{0,}$
英文和数字：^[A-Za-z0-9]+$ 或 ^[A-Za-z0-9]{4,40}$
长度为3-20的所有字符：^.{3,20}$
由26个英文字母组成的字符串：^[A-Za-z]+$
由26个大写英文字母组成的字符串：^[A-Z]+$
由26个小写英文字母组成的字符串：^[a-z]+$
由数字和26个英文字母组成的字符串：^[A-Za-z0-9]+$
由数字、26个英文字母或者下划线组成的字符串：^\w+$ 或 ^\w{3,20}$
中文、英文、数字包括下划线：^[\u4E00-\u9FA5A-Za-z0-9_]+$
中文、英文、数字但不包括下划线等符号：^[\u4E00-\u9FA5A-Za-z0-9]+$ 或 ^[\u4E00-\u9FA5A-Za-z0-9]{2,20}$
可以输入含有^%&',;=?$\”等字符：[^%&',;=?$\x22]+
禁止输入含有~的字符：[^~\x22]+
*
* 特殊需求表达式
Email地址：^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$
域名：[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(/.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+/.?
InternetURL：[a-zA-z]+://[^\s]* 或 ^http://([\w-]+\.)+[\w-]+(/[\w-./?%&=]*)?$
手机号码：^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$
电话号码(“XXX-XXXXXXX”、”XXXX-XXXXXXXX”、”XXX-XXXXXXX”、”XXX-XXXXXXXX”、”XXXXXXX”和”XXXXXXXX)：^($$\d{3,4}-)|\d{3.4}-)?\d{7,8}$
国内电话号码(0511-4405222、021-87888822)：\d{3}-\d{8}|\d{4}-\d{7}
身份证号(15位、18位数字)：^\d{15}|\d{18}$
短身份证号码(数字、字母x结尾)：^([0-9]){7,18}(x|X)?$ 或 ^\d{8,18}|[0-9x]{8,18}|[0-9X]{8,18}?$
帐号是否合法(字母开头，允许5-16字节，允许字母数字下划线)：^[a-zA-Z][a-zA-Z0-9_]{4,15}$
密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线)：^[a-zA-Z]\w{5,17}$
强密码(必须包含大小写字母和数字的组合，不能使用特殊字符，长度在8-10之间)：^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}$
日期格式：^\d{4}-\d{1,2}-\d{1,2}
一年的12个月(01～09和1～12)：^(0?[1-9]|1[0-2])$
一个月的31天(01～09和1～31)：^((0?[1-9])|((1|2)[0-9])|30|31)$
xml文件：^([a-zA-Z]+-?)+[a-zA-Z0-9]+\\.[x|X][m|M][l|L]$
中文字符的正则表达式：[\u4e00-\u9fa5]
双字节字符：[^\x00-\xff] (包括汉字在内，可以用来计算字符串的长度(一个双字节字符长度计2，ASCII字符计1))
空白行的正则表达式：\n\s*\r (可以用来删除空白行)
HTML标记的正则表达式：<(\S*?)[^>]*>.*?</\1>|<.*? /> (网上流传的版本太糟糕，上面这个也仅仅能部分，对于复杂的嵌套标记依旧无能为力)
首尾空白字符的正则表达式：^\s*|\s*$或(^\s*)|(\s*$) (可以用来删除行首行尾的空白字符(包括空格、制表符、换页符等等)，非常有用的表达式)
腾讯QQ号：[1-9][0-9]{4,} (腾讯QQ号从10000开始)
中国邮政编码：[1-9]\d{5}(?!\d) (中国邮政编码为6位数字)
IP地址：\d+\.\d+\.\d+\.\d+ (提取IP地址时有用)
IP地址：((25[0-5]|2[0-4]\d|((1\d{2})|([1-9]?\d)))\.){3}\2
* */
public class SearchIP {
    static int countA = 0;
    static int countB = 0;
    static int countC = 0;
    static int countD = 0;
    static int countE = 0;
    static int countError = 0;
    static int countPrivate = 0;

    //判断输入前半段IP地址是否正确
    public static boolean matchesIP(String s) {
        //定义各种IP的个数变量

        //定义识别IP的正则表达式
        String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."
                + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
        if (Pattern.matches(regex, s))
            return true;
        else {
            return false;
        }
    }

    public static boolean judgeIp(String s, String sIp) {
        if (!marchIPS(sIp)) {
            countError++;
        }
        String[] strs = s.split("\\.");
        if (strs[0].equals("0")||strs[0].equals("127"))
            return true;
        if (matchesIP(s)) {
            String regex = "^(172)\\."
                    + "(1[6-9]|2[0-9]|3[0-1]|)\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";

            if (strs[0].equals("10")) {
                if (marchIPS(sIp)) {
                    countPrivate++;
                    countA++;
                }
                return true;
            } else if (Pattern.matches(regex, s)) {
                if (marchIPS(sIp)) {
                    countPrivate++;
                    countB++;
                }
                return true;
            } else if (strs[0].equals("192") && strs[1].equals("168")) {
                if (marchIPS(sIp)) {
                    countPrivate++;
                    countC++;
                }
                return true;
            } else if (Integer.parseInt(strs[0]) >= 1 && Integer.parseInt(strs[0]) <= 126) {
                if (marchIPS(sIp)) {
                    countA++;
                }
                return true;
            } else if (Integer.parseInt(strs[0]) >= 128 && Integer.parseInt(strs[0]) <= 191) {
                if (marchIPS(sIp))
                    countB++;
                return true;
            } else if (Integer.parseInt(strs[0]) >= 192 && Integer.parseInt(strs[0]) <= 223) {
                if (marchIPS(sIp))
                    countC++;
                return true;
            } else if (Integer.parseInt(strs[0]) >= 224 && Integer.parseInt(strs[0]) <= 239) {
                if (marchIPS(sIp))
                    countD++;
                return true;
            } else if (Integer.parseInt(strs[0]) >= 240 && Integer.parseInt(strs[0]) <= 255) {
                if (marchIPS(sIp))
                    countE++;
                return true;
            } else {
                countError++;
                return false;
            }
        }
        countError++;
        return false;
    }

    //判断子网掩码是否正确
    public static boolean marchIPS(String str) {
        String regex = "[1]+[0]*[0]";
        String[] strs = str.split("\\.");
        String ss = new String();
        for (String s : strs) {
            //将每一位的数转换为二进制
            String ins = Integer.toBinaryString(Integer.parseInt(s));
            if (ins.length() < 8) {
                ins = "00000000" + ins;
                ss += ins.substring(ins.length() - 8);
            } else {
                ss += ins;
            }
        }
        if (Pattern.matches(regex, ss)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        while (scanner.hasNext()) {
            String s = scanner.next();
            //String s = "19..0.~255.255.255.255";
            String[] strings = s.split("~");
            String s1 = strings[0];
            String s2 = strings[1];
            judgeIp(s1, s2);

        }
        System.out.println(countA + " " + countB + " " + countC + " "
                + countD + " " + countE + " " + countError + " "
                + countPrivate);
        scanner.close();
    }


}
