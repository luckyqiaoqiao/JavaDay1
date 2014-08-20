package com.lhb.reg;

/**
 * Created by Administrator on 14-8-20.
 */
public class RegMain {

    public static void main(String[] args) {
        String str =  "27.16.125.0     27.16.131.255   湖北省武汉市武昌区 电信";

        System.out.print(str.replaceAll("[\\u4E00-\\u9FA5]",""));
    }

}
