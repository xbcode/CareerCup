package com.littlemelon.cracking.ch1.q8;

public class RotateString {
	public static boolean isRotation(String s1,String s2){
		int len=s1.length();

		if(len==s2.length()&&len>0){
			String s1s1=s1+s1;
			return isSubString(s1s1,s2);
		}
		return false;
	}
	
	public static boolean isSubString(String s1,String s2){
		int len1=s1.length();
		int len2=s2.length();
		if(len1<len2){
			return false;
		}
		for(int i=0;i<len1-len2+1;i++){
			String s3=s1.substring(i, i+len2);
			if(s3.equals(s2)) return true;
		}
		return false;	
	}
}
