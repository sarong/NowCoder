package src;

public class MpPx{
   public void getMax(int []arr){
       int max=0;
       for(int i=0;i<arr.length;i++){
           int count=0;
           int tmp=arr[i];
           while(tmp/10!=0){
               tmp=tmp/10;
               count++;
           }
           if(count>max)
               max=count;
       }

     /*  int max=0;
       for(int i=0;i<arr.length;i++){
           int count=0;
           int tmp=arr[i];
           while(tmp/10!=0){
                tmp=tmp/10;
                count++;
           }
           if(count>max)
               max=count;
       }
   */

   }


   public void orDer() {


    }
}
