package Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number {
    int count=0;
    public  int solution(int num){
       /* final int  tmp=num%3;*/         //tmp为1或者2；
        while(num>=3){
            count+=num/3;
            if(num/3==1)
                num=num%3;
            else
                num=num/3+num%3;
        }
       /* num+=tmp;*/
        num=num%3;
        if(num>1)
            return ++count;
        else
            return count;

   }

   /* public static void main(String[] args) {
        List<Integer> value = new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        int num;
        while(true){
            num=scan.nextInt();
            if (num==0)
                break;
           else
               value.add(num);
        }
        for(int i=0;i<value.size()-1;i++){

            System.out.println(solution(value.get(i)));
        }
            System.out.print(solution(value.get(value.size()-1)));
            *//*System.out.println(value.get(i));
            *//**//*System.out.println(solution(value.get(i)));*//*
    }*/
}

class Main{
    public static void main(String[] args) {
        List<Integer> value = new ArrayList<>();
        Number number=new Number();
        Scanner scan=new Scanner(System.in);
        int num;
        while(true){
            num=scan.nextInt();
            if (num==0)
                break;
            else
                value.add(num);
        }
        for(int i=0;i<value.size()-1;i++){

            System.out.println(number.solution(value.get(i)));
        }
        System.out.print(number.solution(value.get(value.size()-1)));
        /*System.out.println(value.get(i));
         *//*System.out.println(solution(value.get(i)));*/
    }
}

