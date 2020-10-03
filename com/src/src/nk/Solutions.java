package src.nk;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solutions {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> arrayList = new ArrayList<>();


        int[] arr = new int[n+1];
        int tmp = 1;
        for(int i = 1;i<n;i++){
            arrayList.add(i);
            tmp*=i;
            arr[i] = tmp;
        }

        for(int i = n-1;i>0;i--){

        }
        return sb.toString();
    }

    @Test
    public void test(){

        int n=4;
        int[] fac = new int[n+1];
        int tmp = 1;
        for(int i = 1;i<n+1;i++){
            tmp*=i;
            fac[i] =tmp;
        }
        for(int i = 1;i<n+1;i++)
            System.out.println(fac[i]);
    }
}
