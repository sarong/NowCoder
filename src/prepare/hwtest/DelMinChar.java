package prepare.hwtest;

import java.util.*;
/*
* 删除字符串中出现次数最少的字符
* */
public class DelMinChar {

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){

                String string=sc.nextLine();
                char[] A=string.toCharArray();
                Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();


                for(char c:A){
                    if(!m.containsKey(c)){
                        m.put(c,1);

                    }else{
                        m.put(c,m.get(c)+1);

                    }
                }
                Collection<Integer> al=m.values();
                int index= Collections.min(al);
                StringBuffer sb=new StringBuffer("");
                for(char c:A){
                    if(m.get(c)!=index)
                        sb.append(c);
                }

                System.out.print(sb.toString());

            }

        }

}
