package prepare;

import java.util.*;

public class MathRound {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        System.out.println(Math.round(f));*/
        Map<Character, String> map1 = new HashMap();
        map1.put('0', "");
        map1.put('1', "One");
        map1.put('2', "Tow");
        map1.put('3', "Three");
        map1.put('4', "Four");
        map1.put('5', "Five");
        map1.put('6', "Six");
        map1.put('7', "Seven");
        map1.put('8', "Eight");
        map1.put('9', "Nine");
        Map<Character, String> map2 = new HashMap();
        map2.put('2',"Twenty");
        /*map2.put("0", "");
        map2.put("10", "Ten");
        map2.put("11", "Eleven");
        map2.put("12", "Twelve");
        map2.put("13", "Thirteen");
        map2.put("14", "Fourteen");
        map2.put("15", "Fifteen");
        map2.put("16", "Sixteen");
        map2.put("17", "Seventeen");
        map2.put("18", "Eighteen");
        map2.put("19", "Nineteen");*/
        Map<Character, String> map3 = new HashMap();
        map3.put('2', "Twenty");
        map3.put('3', "Thirty");
        map3.put('4', "Fourty");
        map3.put('5', "Fifty");
        map3.put('6', "Sixty");
        map3.put('7', "Seventy");
        map3.put('8', "Eighty");
        map3.put('9', "Ninety");
        Integer num = 123;
        String str = num.toString();
        List<String> array = new ArrayList<>();
        //将输入的数字转换为char类型
        char[] ch = str.toCharArray();
        int count = 1;
        for (int i = ch.length - 1; i >= 0; i--) {
            if (count == 1){
                array.add(map1.get(ch[i]));
                count++;
            }else if (count == 2){
                array.add(map2.get(ch[i]));
                count++;
            }else if (count == 3){
                array.add(map1.get(ch[i])+" "+"Hundred");
            }
        }
        System.out.println(array);
        for (int i = array.size()-1;i>=0;i--){
            System.out.print(array.get(i)+" ");
        }
    }
}
