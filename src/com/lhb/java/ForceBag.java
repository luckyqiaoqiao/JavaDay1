package com.lhb.java;

import com.lhb.inf.BagSolveInf;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by Administrator on 14-8-11.
 */
public class ForceBag implements BagSolveInf {
    @Override
    public int[] solve(double[] wight, double[] value,double maxWight) {
        int size = wight.length;

        int flag = 1<<size;

        Map<Double,int[] > solveMap = new HashMap<Double,int[]>();

        for(int i=0; i < flag; i++) {
            int[] tmp = new int[size];

            double totalW = 0.0;
            double totalV = 0.0;
            for(int j = 0; j < size; j++) {
                tmp[j] = (i>>j) & 1;
                if(tmp[j]==1){
                    totalW = totalW + wight[j];
                    totalV = totalV + value[j];
                }
            }

            if(totalW <= maxWight) {
                solveMap.put(totalV,tmp);
            }
        }

        double maxValue=0;
        for(double v : solveMap.keySet()) {
            if(v > maxValue) {
                maxValue = v;
            }
        }
        return solveMap.get(maxValue);
    }

}
