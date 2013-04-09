package com.littlemelon.cracking.ch1.q5;


public class StringCompression {
	public static String stringCompression1(String str){
		char last_c=str.charAt(0);
		String new_str="";
		int count=1;
		int character_count=1;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==last_c){
				count++;
			}
			else{
				new_str+=last_c+""+count;
				count=1;
				last_c=str.charAt(i);
				character_count+=1;
			}
		}
		new_str+=last_c+""+count;
		if(character_count==str.length()){
			return str;
		}
		else return new_str;
	}
	public static String stringCompression2(String str){
		char last_c=str.charAt(0);
		StringBuffer new_str=new StringBuffer();
		int count=1;
		int character_count=1;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==last_c){
				count++;
			}
			else{
				new_str.append(last_c);
				new_str.append(count);
				last_c=str.charAt(i);
				character_count++;
				count=1;
			}
		}
		new_str.append(last_c);
		new_str.append(count);
		if(character_count==str.length()){
			return str;
		}
		else{
			return new_str.toString();
		}
		
	}
}
