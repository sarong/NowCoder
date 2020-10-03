package prepare.hwtest;

import java.util.Scanner;

public class PwdCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String pwd = in.nextLine();
            // 长度check, 相同长度超2的子串重复check
            if (pwd.length() <= 8 || pwd.replaceAll("(.{3,})(?=.{3,}\\1)", "").length() < pwd.length()) {
                System.out.println("NG");
                continue;
            }
            // 大小写字母.数字.其它符号check
            int count = 0;
            if (pwd.matches(".*\\d+.*")) count++;
            if (pwd.matches(".*[a-z]+.*")) count++;
            if (pwd.matches(".*[A-Z]+.*")) count++;
            if (pwd.matches(".*[\\p{P}\\p{S}]+.*")) count++;
            if (count < 3) {
                System.out.println("NG");
                continue;
            }
            System.out.println("OK");
        }
        in.close();
    }
}
