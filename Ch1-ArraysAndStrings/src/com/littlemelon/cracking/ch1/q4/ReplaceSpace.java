package com.littlemelon.cracking.ch1.q4;

public class ReplaceSpace {
	
	
	public static String replaceSpace1(String str){
		char[] str_array=str.toCharArray();
		int i=str.length()-1;
		while(str_array[i]==' '){i--;}
		int length=i+1;
		int count=0;
		for (i=0;i<length;i++){
			if(str_array[i]==' '){
				count++;
			}
		}
		int newLength=length+count*2;
		str_array[newLength]='\0';
		for(i=length-1;i>=0;i--){
			if(str_array[i]==' '){
				str_array[newLength-1]='0';
				str_array[newLength-2]='2';
				str_array[newLength-3]='%';
				newLength=newLength-3;
			} else{
				str_array[newLength-1]=str_array[i];
				newLength--;
			}
		}
		String temp=new String(str_array);
		System.out.println(temp);
		newLength=length+count*2;
		String newStr =temp.substring(0, newLength);
		System.out.println(newStr);
		return newStr;
	}
	
	
	public static String replaceSpace2(String str){
		int i=str.length()-1;
		while(str.charAt(i)==' '){i--;}
		String str1=str.substring(0,i+1);
		String out=str1.replaceAll(" ", "%20");
		return out;
	}
}
