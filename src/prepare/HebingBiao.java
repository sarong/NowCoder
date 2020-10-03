package prepare;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HebingBiao {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i =0;i<num;i++){
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if (map.containsKey(key)){
                map.put(key,map.get(key)+value);
            }else{
                map.put(key,value);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());
    }
}
