package prepare.hwtest;

import sun.security.x509.IssuerAlternativeNameExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ErrorW {
    static class Out {
        String sname;
        String hname;
        int count;

        Out() {
        }

        Out(String sname, String hname, int count) {
            this.sname = sname;
            this.hname = hname;
            this.count = count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    public static void solution(ArrayList<String> strings) {
        //空格隔开，得到全路径文件名和行数
        List<Out> list = new ArrayList<>();
        for (String string : strings) {
            String[] ss = string.split("\\s+");
            String[] sname = ss[0].split("\\\\");
            //文件名
            String sres = sname[sname.length - 1];
            boolean flag = true;
            if (list.size() == 0) {
                Out out = new Out(sres, ss[1], 1);
                list.add(out);
            } else {
                for (int i = 0; i < list.size(); i++) {
                    Out o = list.get(i);
                    if (sres.equals(o.sname) && ss[1].equals(o.hname)) {
                        o.count++;
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    Out out = new Out(sres, ss[1], 1);
                    list.add(out);
                }

            }
        }
        if (list.size() > 8) {
            for (int i = list.size()-8; i < list.size(); i++) {
                Out out = list.get(i);
                if (out.sname.length() > 16) {
                    System.out.println(out.sname.substring(out.sname.length() - 16) + " " + out.hname + " " + out.count);
                } else
                    System.out.println((out.sname) + " " + out.hname + " " + out.count);
            }
        }else {
            for (Out out : list){
                if (out.sname.length() > 16) {
                    System.out.println(out.sname.substring(out.sname.length() - 16) + " " + out.hname + " " + out.count);
                } else
                    System.out.println((out.sname) + " " + out.hname + " " + out.count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            list1.add(s);
        }
        solution(list1);
       /* ArrayList<String> list = new ArrayList<>();
       list.add("E:\\V1R2\\product\\fpgadrive.c   1325");
       list.add("E:\\V1R2\\product\\fpgadrive.c   135");
       list.add("E:\\V1R2\\product\\fpgadrive.c   125");
       list.add("E:\\V1R2\\product\\fpgadrive.c   135");
       list.add("E:\\V1R2\\product\\fpgadrive.c   125");
       list.add("E:\\V1R2\\product\\fpgadrive.c   1325");
       list.add("E:\\V1R2\\product\\fpgadrive.c   1325");
       list.add("E:\\V1R2\\product\\fpgadrive.c   1325");
        solution(list);*/
    }
}
