package src.differentways;

public class SolutionWay {
    static int count;
    public int uniquePathsIII(int[][] grid) {
        int tmp1 = 0;
        int tmp2 = 0;
        for(int i=0;i<grid.length;i++)
            for (int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    tmp1=i;
                    tmp2=j;
                }
            }
            System.out.println(tmp1);
            System.out.println(tmp2);
            boolean b = fac(grid,tmp1,tmp2);
            System.out.println(b);
            System.out.println("==============================");
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
         return count;
    }
    public  boolean fac(int[][] arr,int i,int j){
       /* final int tmpI=i;
        final int tmpj=j;*/
        if(arr[i][j]==2){
            for(int m=0;m<arr.length;m++){
                for (int n=0;n<arr[0].length;n++){
                    System.out.print(arr[m][n]+" ");
                }
                System.out.println();
            }

            return true;
            /*i=tmpI;
            j=tmpj;*/
        }
        if(arr[i][j]==0||arr[i][j]==1){
            count++;
            arr[i][j]=3;
            //下，右，上，左
            if(i>0&&fac(arr,i-1,j)){     //上
                return true;
            }
            else if(i<arr[0].length&&fac(arr,i+1,j)){   //下
                return true;
            }
            else if(j>0&&fac(arr,i,j-1)){
                return true;
            }
            else if(j<arr[0].length&&fac(arr,i,j+1)){
                return true;
            }
            else {
                arr[i][j] = -1;
                return false;
            }
        }
        else {
            return false;
        }
    }
}
