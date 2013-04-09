package com.littlemelon.cracking.ch1.q3;

import java.util.Arrays;

public class Permutation {
	public static boolean isPermutation1(String str1, String str2){

		if(str1.length()!=str2.length()) return false;
		
		return sort(str1).equals(sort(str2));
	} 
	
	public static String sort(String str){
		char[] content=str.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean isPermutation2(String str1, String str2){
		if(str1.length()!=str2.length()) return false;
		int[] letters=new int[256];
		char[] str1_array=str1.toCharArray();
		for(char c:str1_array){
			letters[c]++;
		}
		for(int i=0;i<str2.length();i++){
			int c=(int)str2.charAt(i);
			if(--letters[c]<0) return false;
		}
		return true;
	}
}
