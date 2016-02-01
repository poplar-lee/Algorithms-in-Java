/**
 * 
 */
package org.algorithm.one;

/**
 * 连通问题的快速查找算法.
 * @author lifeilong
 * @date 2016年1月31日 下午9:24:12
 */
public class ConnectivityQuickFind {

	private int n;
	private int m;
	
	/**
	 * 当且仅当p和q是连通的，id[p]和id[q]相等.
	 * ps和qs 组成输入对
	 * @param ps 
	 * @param qs
	 * @return
	 */
	public boolean quickFind(int[] ps, int[] qs) {
		int[] id = new int[n];
		for (int i = 0; i < n; i++) {	//初始化值
			id[i] = i;
		}
		
		for (int j = 0; j < m; j++) {
			int p = ps[j];
			int q = qs[j];
			if (id[p] == id[q]) {	//p和q是连通的
				continue;
			}
			for (int i = 0, t = id[p]; i < n; i++) {	//N个对象的连通性
				if (id[i] == t) {
					id[i] = id[q];	//把p位置的值改为q位置的值
				}
			}
			
			System.out.println(p + " --- " + q);
		}
		
		return true;
	}

	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	
	
}
