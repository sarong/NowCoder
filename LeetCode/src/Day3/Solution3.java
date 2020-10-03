package Day3;

import java.util.Stack;

public class Solution3 {
    /*
    * 思路：
    * a.遍历遍历字符串，当出现括号左半边时，将其右半边进栈
    * b.当出现括号右半边时，使之与栈顶元素比较，即ch==stack.pop()；
    * c.当出现ch！=stack.pop或未遍历完栈为空时，返回false，说明括号不匹配
    * d.遍历完成后判断栈是否为空，栈为空则括号全部匹配，皆为有效括号
    *
    *
    * */
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(') stack.push(')');
            else if(ch == '[')stack.push(']');
            else if(ch == '{')stack.push('}');
            else if(stack.isEmpty()||ch!=stack.pop())return false;
        }
        return stack.isEmpty();
    }
}

class Main{
    public static void main(String[] args) {
        Solution3 tmp= new Solution3();
        System.out.println(tmp.isValid("()[[{}]]"));
    }
}