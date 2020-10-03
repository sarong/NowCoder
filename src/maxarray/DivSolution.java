package maxarray;

/*
 * 最大数组arr[low,high]可能的位置：
 *   1）在左边，完全位于子数组arr[left,mid]中,left<=low<=high<=mid
 *   2）在右边，完全位于子数组arr[mid+1,right]中, mid<low<=high<=right
 *   3）在中间，横跨左右，即left<low<mid<high<right
 *
 * */
public class DivSolution {
    public static int div(int[] arr, int left, int right) {

        int maxleftbordersum = Integer.MIN_VALUE, maxrightbordersum = Integer.MIN_VALUE;
        int leftmaxsum = Integer.MIN_VALUE, rightmaxsum = Integer.MIN_VALUE;
        int leftbordersum = 0, rightbordersum = 0;

        //只有一个数
        if (left == right) {
            return left;
        } else {
            int mid = (left + right) / 2;
            leftmaxsum = div(arr, left, mid);
            rightmaxsum = div(arr, mid+1, right);

            for (int i = mid; i >= left; i--) {
                leftbordersum += arr[i];
                if (leftbordersum > maxleftbordersum)
                    maxleftbordersum = leftbordersum;
            }

            for (int i = mid + 1; i <= right; i++) {
                rightbordersum+=arr[i];
                if(rightbordersum > maxrightbordersum)
                    maxrightbordersum = rightbordersum;
            }

            return Integer.max(leftmaxsum,Integer.max(rightmaxsum,maxleftbordersum+maxrightbordersum));
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

       int num =  div(arr,0,arr.length-1);
        System.out.println(num);
    }
}
