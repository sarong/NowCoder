package prepare;

import javax.annotation.PostConstruct;
import java.awt.*;
import java.util.*;

public class Kuosan {
    public static int countLR(int[] a, int[] b) {
        // write code here
        if (a.length == 0)
            return 0;
        int count = 0;
        int tar = 0;
        for (int i = 0; i < a.length; i++) {
            count = 0;
            for (int j = i; j < a.length; j++) {
                count += a[j];
                int temp = b[i]+b[j];
                if (count == temp){
                    tar++;
                }
            }
        }
        return tar;
    }

    public static void main(String[] args) {
   /*     Point point = new Point(1, 2);
        System.out.println(point.x + " " + point.y);
        Point[] PeoplePosition = {new Point(2, 3), new Point(1, 2), new Point(5, 6)};
        Arrays.sort(PeoplePosition, 0, PeoplePosition.length - 1);
        System.out.println(Arrays.toString(PeoplePosition));*/
      int[] a = {1,2,3,4};
      int[] b = {2,1,4,5};
      int result = countLR(a,b);
      System.out.println(result);
    }
   /* public static int CatchVirus (int Personid, Point[] PeoplePosition) {
        // write code here
       *//* Set<Integer> set = new HashSet<>();
        set.add(PeoplePosition[Personid].x);
        set.add(PeoplePosition[Personid].y);
        for (int i = 0; i<PeoplePosition.length; i++){
            if (set.contains(PeoplePosition[i].x)||set.contains(PeoplePosition[i].y))){
                set.add(PeoplePosition[i].x);
                set.add(PeoplePosition[i].y);
            }
        }*//*
        int n = PeoplePosition.length;
        Point inf = PeoplePosition[Personid];

    }*/
}
