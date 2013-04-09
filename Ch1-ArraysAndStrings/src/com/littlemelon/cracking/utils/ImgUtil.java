package com.littlemelon.cracking.utils;

public class ImgUtil {
	public static void printImg(int[][] img){
		int m=img.length;
		int n=img[0].length;
		for(int row=0;row<m;row++){
			for(int col=0;col<n;col++){
				System.out.print(img[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
