package src.number;

public class Solution {
    public static int countNumbersWithUniqueDigits(int n) {
      if(n==0){
          return 1;
      }
      else if(n==1){
          return 10;
      }
      else if(n==2){
          return 9*9+10;
      }
      else {
          return (countNumbersWithUniqueDigits(n-1)-countNumbersWithUniqueDigits(n-2))*(11-n)+countNumbersWithUniqueDigits(n-1);
      }
    }

   /* static int i = 0;
    static int max = 3;
    static StringBuffer stringBuffer = new StringBuffer();
    public static String num(int n){
        stringBuffer.append(n);
      if(n<=max){
          num(n+1);
      }
        return stringBuffer.toString();
    }*/

    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
            System.out.println(countNumbersWithUniqueDigits(i));
    }
}
