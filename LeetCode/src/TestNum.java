import org.junit.Test;

public class TestNum {
    public String  Numb(String num1,String num2){
        char[] values=new char[num1.length()+num2.length()];        //定义数组保存各个位数相乘的和
        for(int i=num1.length()-1;i>=0;i--)
            for(int j=num2.length()-1;j>=0;j--)
                values[i+j+1]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');

        //进位
        int tmp=0;
        for(int i=values.length-1;i>=0;i--){
            values[i]+=tmp;
            tmp=values[i]/10;
            values[i]%=10;
        }

        int index=0;
        while(index<values.length-1&&(int)values[index]==0)
            index++;
        for(int i=index;i<values.length;i++)
            values[i]+='0';
        return new String(values,index,values.length-index);

    }
}

class Main{
    public static void main(String[] args) {
        TestNum testNum=new TestNum();
        testNum.Numb("123","456");
    }
}
