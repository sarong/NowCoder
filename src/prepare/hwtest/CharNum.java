package prepare.hwtest;

import java.util.*;

public class CharNum {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
       /* String str = scanner.next();
        char[] ch = str.toCharArray();
        TreeSet<Character> set = new TreeSet<>();
        for (Character character : ch) {
            set.add(character);
        }
        for (Character character : set) {
            if (character >= 0 && character <= 127)
                count++;
        }
        System.out.println(count);*/

        Integer integer = scanner.nextInt();
        String str = Integer.toBinaryString(integer);
        char[] ch = str.toCharArray();
        int sum = 0;
        for (Character character : ch){
            if (character=='1')
                sum++;
        }
        System.out.println(sum);
      /*  List<String> list = new ArrayList<>();
        for (int i = 0; i < integer; i++) {
            String str = scanner.next();
            list.add(str);
        }
        Collections.sort(list);
        for (String string : list)
        System.out.println(string);*/
        /*String[] strs = str.split(" ");
        for (int i = strs.length - 1; i >= 0; i--)
            System.out.print(strs[i] + " ");*/

    }

}