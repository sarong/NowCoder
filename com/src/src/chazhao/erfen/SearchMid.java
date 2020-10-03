package src.chazhao.erfen;

import java.util.ArrayList;
import java.util.TreeSet;

/*
 *   二分查找的非递归算法
 *
 *
 * */
public class SearchMid {

    public static ArrayList<Integer> searchMid(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (left <= right) {
            int mid = (left + right) / 2;
            if (key < arr[mid]) {
                right = mid - 1;
            } else if (key > arr[mid]) {
                left = mid + 1;
            } else {
                arrayList.add(mid);
                int temp = mid - 1;
                while (temp >= 0 && arr[temp] == key) {
                    arrayList.add(temp);
                    temp--;
                }
                int rtemp = mid + 1;
                while (rtemp < arr.length && arr[rtemp] == key) {
                    arrayList.add(rtemp);
                    rtemp++;
                }
                return arrayList;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6,6,6,6, 7, 8, 9, 9, 9, 9};
        ArrayList<Integer> index = searchMid(arr, 6);
        assert index != null;
        TreeSet<Integer> treeSet = new TreeSet<>(index);
        System.out.println("index=" + treeSet);
    }
}
