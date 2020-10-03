package Question3;

public class Solution3 {
/*
题目描述
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*/
        public static boolean Find(int target, int [][] array) {
            if(array == null) return  false;
            int rows = array.length;
            int cols = array[0].length;
            int row = 0;
            int col = cols-1;
            while(row<rows && col>=0){
                if(array[row][col] == target){
                    return true;
                }
                else if(array[row][col]>target){
                    --col;
                }
                else {
                    ++row;
                }
            }
            /*for(int i=0;i<rows;i++)
                for (int j = 0;j<cols;j++){
                    if(array[i][j] > target)
                        break;
                }*/
            return false;
        }
}

class Main{
    public static void main(String[] args) {
        int[][] array={{1,2,3,4,5,},{6,7,8,9,10},{11,12,13,14,15}};

        System.out.println(Solution3.Find(15,array));
    }
}