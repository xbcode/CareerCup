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

	public Boolean isUnique(){
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
}




