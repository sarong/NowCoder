package src.chazhao.erfen;

/*
 *
 * 二分查找的递归算法
 *
 * */
public class SearchMid_digui {
    static int count = 0;

    public static int search(int[] arr, int left, int right, int key) {
        //定义一个中间值
        int mid = (left + right) / 2;
        int l = left;
        int r = right;
        if (l > r) {
            return -1;
        }
        //判断key值与mid的大小
        if (key < arr[mid]) {
            //左递归
            if (mid == r) {
                mid--;
            }
            r = mid;
            return search(arr, l, r, key);
        } else if (key > arr[mid]) {
            //右递归
            if (mid == l) {
                mid++;
            }
            l = mid;
            return search(arr, l, r, key);
        } else {
            return mid;
        }

    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(search(arr, 0, arr.length - 1, 11));
        System.out.println(count);

    }
}
