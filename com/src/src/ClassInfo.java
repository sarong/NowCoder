package src;

import java.util.ArrayList;
import java.util.List;

public class ClassInfo {
    private String cname;
    private String tname;
    private int count;

    public ClassInfo(){
        this.cname=null;
        this.tname=null;
        this.count=0;
    }

    public ClassInfo(String cname, String tname, int count){
        this.cname=cname;
        this.tname=tname;
        this.count=count;
    }

    public void show(){
        List<String>list=new ArrayList<>();

        list.add(this.cname);
        list.add(this.tname);
        list.add(Integer.toString(this.count));

        System.out.println(list);
    }

}
