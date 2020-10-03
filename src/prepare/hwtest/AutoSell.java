package prepare.hwtest;

import java.util.HashMap;
import java.util.Scanner;

public class AutoSell {
    //钱盒中钱的类型
    private class MoneyType {
        int type;
        int count;

        MoneyType(int type) {
            this.type = type;
            count = 0;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public void print() {
            System.out.println(type + " yuan coin number=" + count);
        }
    }

    MoneyType money1 = new MoneyType(1);
    MoneyType money2 = new MoneyType(2);
    MoneyType money5 = new MoneyType(5);
    MoneyType money10 = new MoneyType(10);

    //商品类型
    private class Prod {
        String name;
        int count;
        int price;

        Prod(String name, int price) {
            this.name = name;
            count = 0;
            this.price = price;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public void print() {
            System.out.println(name + " " + price + " " + count);
        }
    }

    Prod prod1 = new Prod("A1", 2);
    Prod prod2 = new Prod("A2", 3);
    Prod prod3 = new Prod("A3", 4);
    Prod prod4 = new Prod("A4", 5);
    Prod prod5 = new Prod("A5", 8);
    Prod prod6 = new Prod("A6", 6);

    //初始化
    public void init(String string) {
        //str1[0]
        String[] str1 = string.split("\\s+");
        if (str1[0].equals("r")) {
            String[] str2 = str1[1].split("-");
            prod1.setCount(Integer.parseInt(str2[0]));
            prod2.setCount(Integer.parseInt(str2[1]));
            prod3.setCount(Integer.parseInt(str2[2]));
            prod4.setCount(Integer.parseInt(str2[3]));
            prod5.setCount(Integer.parseInt(str2[4]));
            prod6.setCount(Integer.parseInt(str2[5]));
            String[] str3 = str1[2].split("-");
            money1.setCount(Integer.parseInt(str3[0]));
            money2.setCount(Integer.parseInt(str3[1]));
            money5.setCount(Integer.parseInt(str3[2]));
            money10.setCount(Integer.parseInt(str3[3]));
            System.out.println("S001:Initialization is successful");
        }
    }

    //查询
    public void search(String string) {
        if (string.equals("q 0")) {
            prod1.print();
            prod2.print();
            prod3.print();
            prod4.print();
            prod5.print();
            prod6.print();
        } else if (string.equals("q 1")) {
            money1.print();
            money2.print();
            money5.print();
            money10.print();
        }
    }

    //购买p+商品名或p+价格
    public void buy(String string) {
        String[] str = string.split(" ");
        if (str[1].equals("A1")) {
            System.out.println("S003:Buy success,balance=" + prod1.price);
        } else if (str[1].equals("A2")) {
            System.out.println("S003:Buy success,balance=" + prod2.price);
        } else if (str[1].equals("A3")) {
            System.out.println("S003:Buy success,balance=" + prod3.price);
        } else if (str[1].equals("A4")) {
            System.out.println("S003:Buy success,balance=" + prod4.price);
        } else if (str[1].equals("A5")) {
            System.out.println("S003:Buy success,balance=" + prod5.price);
        } else if (str[1].equals("A6")) {
            System.out.println("S003:Buy success,balance=" + prod6.price);
        } else {
                System.out.println("S002:Pay success,balance=1"+Integer.parseInt(str[1]));
        }
    }
    public void doString(String s){
        String[] strings = s.split(";");

        init(strings[0]);
    }
    public static void main(String[] args) {

        AutoSell autoSell = new AutoSell();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            autoSell.init(s);
        }
        scanner.close();


    }

}
