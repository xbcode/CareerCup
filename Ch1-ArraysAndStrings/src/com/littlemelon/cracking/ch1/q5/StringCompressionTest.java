package com.littlemelon.cracking.ch1.q5;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringCompressionTest {
	private String expected;
	private String target;

	@SuppressWarnings("rawtypes")
	@Parameters
	public static Collection words() {
		return Arrays.asList(new Object[][] { { "a2b1c5a3", "aabcccccaaa" },
				{ "a1b1c5a3", "abcccccaaa" }, { "abce", "abce" },{"a28r19w20s1x1g1e1r1w1r1f1","aaaaaaaaaaaaaaaaaaaaaaaaaaaarrrrrrrrrrrrrrrrrrrwwwwwwwwwwwwwwwwwwwwsxgerwrf"}

		});
	}

	public StringCompressionTest(String expected, String target) {
		this.expected = expected;
		this.target = target;
	}

	@Test
	public void testStringCompression() {
		long t1=System.currentTimeMillis();
		assertEquals(expected, StringCompression.stringCompression1(target));
		long t2=System.currentTimeMillis();
		System.out.println("String excution time:"+(t2-t1));
		assertEquals(expected,StringCompression.stringCompression2(target));
		long t3=System.currentTimeMillis();
		System.out.println("StringBuffer excution time:"+(t3-t2));
	}
}
