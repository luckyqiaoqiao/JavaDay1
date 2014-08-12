package com.lhb.java;

import com.lhb.inf.BagSolveInf;

/**
 * Created by Administrator on 14-8-12.
 */
public class GreedyBag implements BagSolveInf {
    public int[] solve(double[] wight, double[] value,double maxWight) {
        int size = wight.length;
        int[] sortIndex = new int[size];

        for(int i = 0 ; i < size; i++)
            sortIndex[i] = i;

        for(int i = 0; i < size; i++) {
            for(int j = i+1; j < size; j++) {
                if(wight[sortIndex[j]] > wight[sortIndex[i]]) {
                    int tmp = sortIndex[i] ;
                    sortIndex[i] = sortIndex[j];
                    sortIndex[j] = tmp;
                }
            }
        }

        double tmpWight = 0;
        int[] result = new int[size];
        for(int i = 0 ; i < size ; i++ ) {
            result[i] = 0;
        }


        for(int i = 0 ; i < size ; i++) {
            if((tmpWight + wight[sortIndex[i]]) <= maxWight)
            {
                tmpWight += (wight[sortIndex[i]]);
                result[sortIndex[i]] = 1;
            }
        }

        return  result;
    }
}
