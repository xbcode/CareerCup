package com.littlemelon.cracking.ch1.q1;

public class UniqueString {
	
	String str;
	public UniqueString(){
	}
	
	public String getS() {
		return str;
	}

	public void setS(String str) {
		this.str = str;
	}
	
	//Time: O(n), Space: O(1)
	public Boolean isUnique1(){
		if(str.length()>256) return false;
		
		boolean[] chars=new boolean[256];
		for(int i=0; i<str.length();i++){
			int val=str.charAt(i);
			if(chars[val])
				return false;
			chars[val]=true;
		}
		return true;
	}
	
	//Time: O(n*n), Space: O(1)
	public Boolean isUnique2(){
		if(str.length()>256) return false;
		
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length()-i;j++){
				if(str.charAt(i)==str.charAt(j))
					return false;
			}
		}
		return true;
	}
	
	//Time: , Space: int
	//string contains only from a to z
	public Boolean isUnique3(){
		if(str.length()>256) return false;
		
		int checker=0;
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i)-'a';
			if((checker&(1<<val))>0)//check if a char already exists.
				return false;
			checker |=(1<<val);//mark the char, if exists,do nothing, or set the flag to 1.
		}
		return true;
	}
	
	//Time: O(nlog(n)+..)
	//sort string, check neighboring
	public Boolean isUnique4(){
		//to do...
		
		return false;
	}
}




