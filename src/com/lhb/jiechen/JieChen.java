package com.lhb.jiechen;

/**
 * Created by Administrator on 14-8-13.
 */
public class JieChen {
    public static void main(String[] args) {
        int num = 3;
        double result = 0;
        double temp = 1;
        int i = 1;
        while( i <= num ) {
            temp =  temp/i;
            result = result + temp;
            i = i+1;
        }

        System.out.print(result);
    }
}
