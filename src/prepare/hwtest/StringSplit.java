package prepare.hwtest;

import java.util.Scanner;

public class StringSplit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = Integer.parseInt(in.nextLine());
            for(int i = 0 ; i < n ; i++){
                String str = in.nextLine();
                strSplit(str);
            }
        }
    }

    private static void strSplit(String str) {
        String s = str.trim();
        if (s == null)
            return;
        while (s.length() >= 8) {
            System.out.println(s.substring(0, 8));
            s = s.substring(8);
        }
        s += "00000000";
        System.out.println(s.substring(0, 8));
    }

}
