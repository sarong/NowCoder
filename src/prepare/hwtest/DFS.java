package prepare.hwtest;

import java.util.Scanner;

/*
* 24点游戏算法
* */
public class DFS {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double result=0.0;
        int[] num=new int[4];
        while(input.hasNext()){
            int[] temp=new int[4];
            for(int i=0;i<4;i++){
                num[i]=input.nextInt();
            }
            System.out.println(check(num,temp,result));
        }
        input.close();
    }

    private static boolean check(int[] num,int[] temp,double result) {
        for(int i=0;i<num.length;i++){
            if(temp[i]==0){
                temp[i]=1;
                if(check(num,temp,result+num[i])
                        || check(num,temp,result-num[i])
                        || check(num,temp,result*num[i])
                        || check(num,temp,result/num[i])){
                    return true;
                }
                temp[i]=0;
            }
        }
        if(result==24){
            return true;
        }else{
            return false;
        }
    }
}
/*
*
* #include <stdio.h>
#include <algorithm>
using namespace std;
const int N=4;
int num[N];
int isSolve=0;
void dfs(int index,int currentNum,int arr[])
{
        if(currentNum==24)
        {
                isSolve=1;
                return;
        }
        if(isSolve||currentNum>24||index>=4)
                return;
        for(int operFlag=0;operFlag<4;operFlag++)
        {
                switch(operFlag)
                {
                        case 0:
                                dfs(index+1,currentNum+arr[index],arr);
                                break;
                        case 1:
                                dfs(index+1,currentNum-arr[index],arr);
                                break;
                        case 2:
                                dfs(index+1,currentNum*arr[index],arr);
                                break;
                        case 3:
                                dfs(index+1,currentNum/arr[index],arr);
                                break;
                }
                if(isSolve)
                        return;
        }
}
int main()
{
        while(scanf("%d%d%d%d",&num[0],&num[1],&num[2],&num[3])>0)
        {
                isSolve=0;
                sort(num,num+4);
                do
                {
                        dfs(1,num[0],num);
                        if(isSolve)
                                break;
                } while (next_permutation(num,num+4));
                if(isSolve)
                        printf("true\n");
                else
                        printf("false\n");
        }
        return 0;
}

* */
