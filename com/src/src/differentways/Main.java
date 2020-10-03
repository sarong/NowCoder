package src.differentways;

public class Main {
    public static void main(String[] args) {
        int[][] arr={{1,0,0,0,0},{0,0,0,0,0},{0,0,2,-1,0}};
       /* System.out.println(arr.length);
        System.out.println(arr[0].length);*/
        SolutionWay solutionWay = new SolutionWay();
        System.out.println(solutionWay.uniquePathsIII(arr));
    }
}
