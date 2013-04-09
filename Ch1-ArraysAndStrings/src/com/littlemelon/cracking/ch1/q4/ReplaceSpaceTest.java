package com.littlemelon.cracking.ch1.q4;

import junit.framework.Assert;
import org.junit.Test;

public class ReplaceSpaceTest {

	@Test
	public void testReplaceSpace() {
		Assert.assertEquals("Mr%20John%20Smith", ReplaceSpace.replaceSpace1("Mr John Smith     "));
		Assert.assertEquals("Mr%20John%20Smith", ReplaceSpace.replaceSpace2("Mr John Smith     "));
	}

}
