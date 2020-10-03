package prepare;

import java.util.Scanner;

public class Changeto16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println(Integer.valueOf(str.substring(2),16).toString());
        }
    }
}
