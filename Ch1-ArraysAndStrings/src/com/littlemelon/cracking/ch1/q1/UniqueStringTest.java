package com.littlemelon.cracking.ch1.q1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniqueStringTest {

	UniqueString us;
	@Before
	public void setUp() throws Exception {
		us=new UniqueString();
	}

	@Test
	public void testIsUnique() {
		us.setS("abcdefghijklmn");
		Assert.assertEquals(true, us.isUnique1());
		Assert.assertEquals(true, us.isUnique2());
		Assert.assertEquals(true, us.isUnique3());
		us.setS("ssssdgsdseg");
		Assert.assertEquals(false, us.isUnique1());
		Assert.assertEquals(false, us.isUnique2());
		Assert.assertEquals(false, us.isUnique3());
		
	}

}
