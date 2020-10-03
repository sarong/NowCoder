package src.digui;

public class maze {
    public static void main(String[] args) {
        int[][] arrs = new int[8][7];
        for(int i=0;i<7;i++){
            arrs[0][i]=1;
            arrs[7][i]=1;
        }

        for(int i=0;i<8;i++){
            arrs[i][0]=1;
            arrs[i][6]=1;
        }
        /*arrs[3][1] = 1;
        arrs[3][2] = 1;
        arrs[4][3] = 1;*/
        for(int i = 0; i<8; i++){
            for (int j = 0; j<7; j++){
                System.out.print(arrs[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("======");
        solution1(arrs,2,2);
        System.out.println("==========");
        for(int i = 0; i<8; i++){
            for (int j = 0; j<7; j++){
                System.out.print(arrs[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(count);
    }
    static int count =0;
    public static boolean solution1(int[][] arr, int i, int j){
        while(true){
        if(arr[5][4]==2) {
            count++;
            for(int m = 0; m<8; m++){
                for (int n = 0; n<7; n++){
                    System.out.print(arr[m][n]+" ");
                }
                System.out.println();
            }
            System.out.println("======");
            i=2;
            j=2;
            arr[i][j]=0;
            arr[5][4]=0;
        }
       // else{
            if(arr[i][j]==0){
                arr[i][j]=2;
                //下，右，上，左
                if(solution1(arr,i+1,j)){
                    return true;
                }
                else if(solution1(arr,i,j+1)){
                    return true;
                }
                else if(solution1(arr,i-1,j)){
                    return true;
                }
                else if(solution1(arr,i,j-1)){
                    return true;
                }
                else {
                    arr[i][j] = 3;
                    return false;
                }
            }
            else {
                return false;
            }
        }
       // }
    }
}
