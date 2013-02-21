package com.littlemelon.cracking.ch1.q3;

import org.junit.Assert;
import org.junit.Test;

public class PermutationTest {

	@Test
	public void testIsPermutation() {
		Assert.assertEquals(false, Permutation.isPermutation1("absse", "abc"));
		Assert.assertEquals(false, Permutation.isPermutation1("abc", "abcd"));
		Assert.assertEquals(true, Permutation.isPermutation1("acb", "abc"));
		Assert.assertEquals(true, Permutation.isPermutation1("a", "a"));
		Assert.assertEquals(true, Permutation.isPermutation1("ab", "ab"));
		
		Assert.assertEquals(false, Permutation.isPermutation2("absse", "abc"));
		Assert.assertEquals(false, Permutation.isPermutation2("abc", "abcd"));
		Assert.assertEquals(true, Permutation.isPermutation2("acb", "abc"));
		Assert.assertEquals(true, Permutation.isPermutation2("a", "a"));
		Assert.assertEquals(true, Permutation.isPermutation2("ab", "ab"));
	}

}
