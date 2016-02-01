/**
 * 
 */
package org.algorithm.one;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author lifeilong
 * @date 2016年1月31日 下午9:52:21
 */
public class ConnectivityQuickFindTest {
	
	static int[] ps = new int[12];	//ps和qs 组成输入对
	static int[] qs = new int[12]; 
	
	static {
		ps[0] = 3;
		ps[1] = 4;
		ps[2] = 8;
		ps[3] = 2;
		ps[4] = 5;
		ps[5] = 2;
		ps[6] = 5;
		ps[7] = 7;
		ps[8] = 4;
		ps[9] = 5;
		ps[10] = 0;
		ps[11] = 6;
		
		qs[0] = 4;
		qs[1] = 9;
		qs[2] = 0;
		qs[3] = 3;
		qs[4] = 6;
		qs[5] = 9;
		qs[6] = 9;
		qs[7] = 3;
		qs[8] = 8;
		qs[9] = 6;
		qs[10] = 2;
		qs[11] = 1;
	}
	
	@Test
	public void canQuickFindTrue() {
		ConnectivityQuickFind cqf = new ConnectivityQuickFind();
		cqf.setM(12);
		cqf.setN(1000);
		assertEquals(true, cqf.quickFind(ps, qs));
	}

}
