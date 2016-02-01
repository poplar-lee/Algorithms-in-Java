/**
 * 
 */
package org.algorithm.one;

/**
 * ��ͨ����Ŀ��ٲ����㷨.
 * @author lifeilong
 * @date 2016��1��31�� ����9:24:12
 */
public class ConnectivityQuickFind {

	private int n;
	private int m;
	
	/**
	 * ���ҽ���p��q����ͨ�ģ�id[p]��id[q]���.
	 * ps��qs ��������
	 * @param ps 
	 * @param qs
	 * @return
	 */
	public boolean quickFind(int[] ps, int[] qs) {
		int[] id = new int[n];
		for (int i = 0; i < n; i++) {	//��ʼ��ֵ
			id[i] = i;
		}
		
		for (int j = 0; j < m; j++) {
			int p = ps[j];
			int q = qs[j];
			if (id[p] == id[q]) {	//p��q����ͨ��
				continue;
			}
			for (int i = 0, t = id[p]; i < n; i++) {	//N���������ͨ��
				if (id[i] == t) {
					id[i] = id[q];	//��pλ�õ�ֵ��Ϊqλ�õ�ֵ
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
