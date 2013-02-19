package com.littlemelon.cracking.ch1.q1;

public class UniqueString {
	
	String s;
	public UniqueString(){
	}
	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public Boolean isUnique(){
		for(int i=0; i<s.length();i++){
			for(int j=i+1;j<s.length()-i;j++){
				if(s.charAt(j)==s.charAt(i))
					return false;
			}
		}
		return true;
	}
}




