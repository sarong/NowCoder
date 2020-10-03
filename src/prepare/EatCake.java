package prepare;

public class EatCake {
    public static int count(int n){
        int sum = 0;
        for(int i = n;i>0;i--){
            sum=(sum+1)*3/2;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(count(4));
    }
}
