package com.littlemelon.cracking.ch1.q7;

import com.littlemelon.cracking.utils.ImgUtil;

public class SetZeroRowCol {
	public static void setZeroRowCol(int[][] img){
		int m=img.length;
		int n=img[0].length;
		int[] rols=new int[m];
		int[] cols=new int[n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(img[i][j]==0){
					rols[i]=1;
					cols[j]=1;
				}
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(rols[i]==1|cols[j]==1){
					img[i][j]=0;
				}
			}
		}
	}

	public static void main(String arg[]){
		int[][] img={{0,1,2},{3,4,5},{6,7,8}};
		ImgUtil.printImg(img);
		setZeroRowCol(img);
		ImgUtil.printImg(img);
	}
}
