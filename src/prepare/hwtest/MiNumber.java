package prepare.hwtest;

import java.util.Scanner;

//最小公倍数
public class MiNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a>b?a:b;
        for(int i = temp; ;i++){
            if (i%a==0&&i%b==0){
                System.out.println(i);
                break;
            }
        }*/
        String str = sc.nextLine();
        if (str == null)
            return;
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }

}
