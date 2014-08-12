package com.lhb.java;

import com.lhb.inf.BagSolveInf;

/**
 * Created by Administrator on 14-8-12.
 */
public class GreedyContext {

    private BagSolveInf bagSolve;

    public GreedyContext(BagSolveInf bagSolve) {
        this.bagSolve = bagSolve;
    }

    public int[] getResult(double[] w, double[] v, double maxW) {
        return bagSolve.solve(w,v,maxW);
    }
}
