package Question1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StringLength {


    public int solution(String s){
       /* try {
            String[] str1 = s.split(" ");
            return str1[str1.length - 1].length();
        }catch (Exception e){
            return 0;
        }*/
        char []arr=s.toCharArray();

        int count=0;
        try{
            for(int i=arr.length-1;i>=0;i-- ) {
                if(arr[i]!=' ')
                    count++;
                else
                    break;
            }
        return count;}catch (Exception e){
            return 0;
        }
    }

}

class Main{
    public static void main(String[] args){

        String str="a ";
        StringLength stringLength=new StringLength();


        System.out.println( stringLength.solution(str));
       /* Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] str1 = str.split(" ");

        System.out.println(str1[str1.length-1].length());*/
        /* System.out.println(str1[str1.length-1].length());*/
    }
}