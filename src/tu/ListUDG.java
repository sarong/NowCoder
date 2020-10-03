package tu;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class ListUDG {
    private String[] vexs = null;//点集
    private int[][] arcs = null;//边集

    public ListUDG(int vexNum, int arcNum){
        this.vexs = new String[vexNum];
        this.arcs = new int[vexNum][vexNum];

        //初始化边集
        for (int i = 0; i < vexNum;i++ ){
            for (int j = 0; j<vexNum; j++){
                this.arcs[i][j] = 0;
            }
        }

        //建立边集

    }
}
