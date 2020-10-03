package StringRevers;

public class Solution {
    public String reverseWords(String s) {
        //将字符串逆置
        String[] strs = s.split(" ");
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            buffer.append(new StringBuffer(strs[i]).reverse().toString());
            buffer.append(" ");
        }
        return buffer.toString().trim();
    }
}

class test{
    public static void main(String[] args) {
        Solution solution=new Solution();
       /* solution.reverseWords("Hello World");*/
        System.out.println("s:"+solution.reverseWords("Hello World"));
    }
}