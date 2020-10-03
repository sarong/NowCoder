package src;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void add(int i,int j){
        i+=j;
    }

    public static void main(String[] args) {
        int i=4;
        int j=2;
        add(i,j);
        System.out.println(i);

    }

    @Test
    public void Test1() {
        List<Integer> list = new ArrayList<>();


          for (int a=1; a <= 9; a++)
            for (int b=0; b <= 9; b++)
                for (int c=0; c <= 9; c++)
                    for (int d = 0; d <= 9; d++)
                    {
                        int tmp =d*1000+ a * 100 + b * 10 + c ;
                        if (d*d*d+a * a * a + b * b * b + c * c * c  == tmp)
                            System.out.println(tmp);
                    }
    }

    @Test
    public void Test2() {
        for (int i = 1; i <= 10000; i++) {
            int a, b, c, d;
            a = i % 10;
            b = i / 10 % 10;
            c = i / 10 / 10 % 10;
            d = i / 10 / 10 / 10 % 10;
            if (i >= 100 && i < 1000 && i == a * a * a + b * b * b + c * c * c + d * d * d) {
                System.out.println(i);
            } else if (i >= 1000 && i <= 10000 &&
                    i == a * a * a * a + b * b * b * b +
                            c * c * c * c + d * d * d * d) {
                System.out.println(i);
            }
        }
    }

    @Test
    public void Test3(){
        Bases bases=new Bases();
        bases.setHeigh(-1);
        bases.setWeigth(2.0);
        bases.show();
        System.out.println("面积："+bases.acreage());
        System.out.println("体积: "+bases.volume());

    }

    @Test
    public void Test4(){
        ClassInfo classInfo1=new ClassInfo("C++","sa1",2);
        ClassInfo classInfo2=new ClassInfo("python","sa2",3);
        ClassInfo classInfo3=new ClassInfo("java","sa3",4);
        classInfo1.show();
        classInfo2.show();
        classInfo3.show();
    }

    @Test
    public void Test5() {
            List<Integer> list=new ArrayList<>();

            list.add(1);
            list.add(2);

            System.out.println(list.size());
    }
}
