package src;

public class Bases {
    private double weigth;
    private double heigh;

    public boolean setWeigth(double weigth){
        if(weigth<=0)
        { System.out.println("输入值有误");
            return false;
        }
        this.weigth=weigth;
        return true;
    }

    public boolean setHeigh(double heigh) {
        if(heigh<=0){
            System.out.println("输入值有误");
            return false;
        }
        this.heigh = heigh;
        return true;
    }

    public double acreage(){
        return weigth*weigth*3.14;
    }

    public double volume(){
        return this.acreage()*heigh;
    }

    public void show(){
        System.out.println("半径:"+this.weigth+"高: "+this.heigh+"底面积："
                +this.acreage()+"体积:"+this.volume());
    }
}
