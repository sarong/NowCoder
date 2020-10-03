package src.queuen;

public class Queuen {
    //8x8矩阵
    int max = 10                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ;
    int arr[] = new int[max];

    static int count=0;
    static int pcount=0;
    public static void main(String[] args) {
        Queuen queuen = new Queuen();
        queuen.check(0);
        System.out.println("种类："+count);
        System.out.println("次数："+pcount);

    }

    public void check(int n){
        if(n==max){
            print();
            return;
        }

        for(int i =0;i<max;i++){
            arr[n]=i;
            if (judgea(n)){
                check(n+1);
            }
        }
    }

    public boolean judgea(int n){
        pcount++;
        for(int i = 0;i<n;i++){
            if(arr[i]==arr[n]||Math.abs(i-n)==Math.abs(arr[i]-arr[n])){
                return false;
            }
        }
        return true;
    }

    private void print(){
        count++;
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}
