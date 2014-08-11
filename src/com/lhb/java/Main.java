package com.lhb.java;

import com.lhb.inf.BagSolveInf;

public class Main {
    /**
     * This is a test program
     * @param args 参数
     */
    public static void main(String[] args) {
	    double[] w = {7,3,4,5};
        double[] v = {42,12,40,25};
        double maxw = 10;

        BagSolveInf bagSolve = new ForceBag();
        int[] res = bagSolve.solve(w,v,maxw);

        double maxv = 0;
        for(int i = 0;i<res.length;i++) {
            if(res[i] == 1) {
                System.out.print(w[i]+"\t");
                maxv = maxv +v[i];
            }
        }
        System.out.println("total value:" + maxv);
    }
}
