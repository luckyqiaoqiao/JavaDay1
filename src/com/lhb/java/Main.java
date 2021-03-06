package com.lhb.java;

public class Main {
	/**
	 * This is a test program
	 * @param args 参数
	 */
	public static void main(String[] args) {
		double[] w = {7,2,3,5};
		double[] v = {42,16,40,25};
		double maxW = 10;

		GreedyContext greedyContext ;
		if(args.length > 0 && args[0].equals("greedy"))
			greedyContext = new GreedyContext(new GreedyBag());
		else if (args.length > 0 && args[0].equals("valueGreedy"))
			greedyContext = new GreedyContext(new ValueGreedyBag());
		else
			greedyContext = new GreedyContext(new PreValueGreedyBag());


		int[] res = greedyContext.getResult(w,v,maxW);

		double maxV = 0;
		for(int i = 0;i<res.length;i++) {
			if(res[i] == 1) {
				System.out.print(w[i]+"\t");
				maxV = maxV +v[i];
			}
		}
		System.out.println("total value:" + maxV);
	}
}
