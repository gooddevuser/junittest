package com.myjunit.junittest;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class TestPage {
	
	Lotto lotto = new Lotto();
	
	int[] lottonum = {(int)lotto.getNum1(),(int)lotto.getNum2(),
					  (int)lotto.getNum3(),(int)lotto.getNum4(),
					  (int)lotto.getNum5(),(int)lotto.getNum6(),
					  (int)lotto.getNum7()};
	
	// TO-DO : lottonum 값을 비교하는것 / 값이 나오지않음
    @Test
    public void Test1() {
		
    	Lotto lotto = new Lotto();
		
    	lotto.setNum1((int)(Math.random()*50));
    	lotto.setNum2((int)(Math.random()*60));
    	lotto.setNum3((int)(Math.random()*70));
    	
    	assertTrue((int)lottonum[0] < 50);
    	assertTrue((int)lottonum[1] < 50);
    	assertTrue((int)lottonum[2] < 50);
    	
		System.out.println(Arrays.toString(lottonum));
    };
    
    @Test
    public void Test2() {
		
    	Lotto lotto = new Lotto();
		
    	lotto.setNum4((int)(Math.random()*50));
    	lotto.setNum5((int)(Math.random()*60));
    	lotto.setNum6((int)(Math.random()*70));
    	
	    assertEquals((int)lottonum[3],(int)lottonum[4]);
	    assertSame((int)lottonum[5],(int)lottonum[6]);
    }	
    
    @Test
    public void Test3() {
		
    	Lotto lotto = new Lotto();
		
    	lotto.setNum7((int)(Math.random()*50));
    	assertNotNull((int)lottonum[6]);
    	
    }
}

