package com.littlemelon.cracking.ch1.q8;

import junit.framework.Assert;

import org.junit.Test;

public class RotateStringTest {
	
	@Test
	public void testIsRotation() {
		Assert.assertTrue(RotateString.isRotation("abcd","bcda"));
		Assert.assertFalse(RotateString.isRotation("asfe", "se"));
		Assert.assertFalse(RotateString.isRotation("abcd","bcdaa"));
	}

	@Test
	public void testIsSubString() {
		Assert.assertTrue(RotateString.isSubString("abcd", "abcd"));
		Assert.assertTrue(RotateString.isSubString("abcde", "abcd"));
		Assert.assertTrue(RotateString.isSubString("abcd", ""));
//		Assert.assertTrue(RotateString.isSubString("abcd", null));
		Assert.assertFalse(RotateString.isSubString("abc", "abcd"));
		Assert.assertFalse(RotateString.isSubString("abcd", "bcda"));
	}

}
