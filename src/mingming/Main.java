package mingming;

import maxarray.Solution;
import org.junit.Test;

import java.util.*;


public class Main {

    public static void Solution(String string) {
        String regex = "\\s+";
        String[] sregx = string.split(regex);
        if (sregx.length == 0)
            return;
        int tag = string.length() / 8;
        int last = string.length() % 8;
        int j = 0;
        for (int i = 0; i < tag; i++) {
            System.out.println(string.substring(j, j + 8));
            j += 8;
        }
        if (last > 0) {
            String str = string.substring(string.length() - last, string.length());
            String[] strtmp = str.split(regex);
            if (strtmp.length == 0) {
                return;
            } else {
                for (int i = 0; i < 8 - last; i++) {
                    str = str + "0";
                }
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution(str1);
        Solution(str2);
    }
}

/* Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int total = scan.nextInt();
            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < total; i++) {
                int temp = scan.nextInt();
                set.add(temp);
            }
            for (int num : set) {
                System.out.println(num);
            }
        }
    }*/
