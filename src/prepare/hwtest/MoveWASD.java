package prepare.hwtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveWASD {

    public static void move() {
        int x = 0;
        int y = 0;
        String str = "A10;S20;W10;D30;X;A1A;B10A11;;A10;";
        char[] ch = str.toCharArray();
        int count = 0;
        while (count < ch.length) {
            if (ch[count] == 'W') {
                count++;
                List<Character> list = new ArrayList<>();
                while (count < ch.length) {
                    if (ch[count] >= '0' && ch[count] <= '9') {
                        list.add(ch[count]);
                        count++;
                    } else break;
                }
                char[] chars = new char[list.size()];
                int i = 0;
                for (Character character : list) {
                    chars[i] = character;
                    i++;
                }
                String temp = new String(chars);
                Integer integer = Integer.parseInt(temp);
                y += integer;
                System.out.println(x+" "+y);
            } else if (ch[count] == 'A') {
                count++;
                List<Character> list = new ArrayList<>();
                while (count < ch.length) {
                    if (ch[count] >= '0' && ch[count] <= '9') {
                        list.add(ch[count]);
                        count++;
                    } else break;
                }
                char[] chars = new char[list.size()];
                int i = 0;
                for (Character character : list) {
                    chars[i] = character;
                    i++;
                }
                String temp = new String(chars);
                Integer integer = Integer.parseInt(temp);
                x -= integer;
                System.out.println(x+" "+y);
            } else if (ch[count] == 'S') {
                count++;
                List<Character> list = new ArrayList<>();
                while (count < ch.length) {
                    if (ch[count] >= '0' && ch[count] <= '9') {
                        list.add(ch[count]);
                        count++;
                    } else break;
                }
                char[] chars = new char[list.size()];
                int i = 0;
                for (Character character : list) {
                    chars[i] = character;
                    i++;
                }
                String temp = new String(chars);
                Integer integer = Integer.parseInt(temp);
                x += integer;
                System.out.println(x+" "+y);
            } else if (ch[count] == 'D') {
                count++;
                List<Character> list = new ArrayList<>();
                while (count < ch.length) {
                    if (ch[count] >= '0' && ch[count] <= '9') {
                        list.add(ch[count]);
                        count++;
                    } else break;
                }
                char[] chars = new char[list.size()];
                int i = 0;
                for (Character character : list) {
                    chars[i] = character;
                    i++;
                }
                String temp = new String(chars);
                Integer integer = Integer.parseInt(temp);
                x += integer;
                System.out.println(x+" "+y);
            }
            count++;
        }
        System.out.println(x + "," + y);
    }

    public static void main(String[] args) {
        move();
    }
}
