package prepare;

import java.beans.IntrospectionException;
import java.util.*;
/*
* 明明的随机数
*
* */
public class MIng {
   /* public static void rand(List<Integer> arr) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(arr);
        for (Integer s : treeSet) {
            System.out.println(s);
        }
    }
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            int num1 = sc.nextInt();
            if (num1 > 0) {
                for (int i = 0; i < num1; i++) {
                    treeSet.add(sc.nextInt());
                }
            }
            for(Integer i : treeSet)
                System.out.println(i);
        }

    }
 /* public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      while(sc.hasNext()){

          TreeSet<Integer> set=new TreeSet<Integer>();
          int n=sc.nextInt();
          if(n>0){
              for(int i=0;i<n;i++){
                  set.add(sc.nextInt());
              }
          }
          for(Integer i:set){
              System.out.println(i);
          }
      }
  }*/
}
