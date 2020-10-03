package Question4;

public class Solution4 {

  /*替换空格：
  请实现一个函数，将一个字符串中的每个空格替换成“%20”。
  例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy*/

    public static String replaceSpace(StringBuffer str) {
       /* StringBuffer tmp = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                tmp.append("%20");
            else
                tmp.append(str.charAt(i));
        }
        return tmp.toString();*/
       return str.toString().replace(" ","%20");
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Nice to meet you");
        String s=replaceSpace(stringBuffer);
        System.out.println(s);
    }
}
