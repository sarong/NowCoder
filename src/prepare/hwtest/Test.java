package prepare.hwtest;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ss = s.split("\\s+");
        for (String s1 : ss){
            System.out.println(s1);
        }
    }
}
