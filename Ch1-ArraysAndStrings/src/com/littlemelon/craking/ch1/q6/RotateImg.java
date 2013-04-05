package com.littlemelon.craking.ch1.q6;

import com.littlemelon.cracking.utils.ImgUtil;

public class RotateImg {
	
	//Execution O(N*N)
	public static void rotateImg(int[][] img, int n){
		for(int layer=0;layer<n/2;layer++){
			int first=layer;
			int last=n-1-layer;
			for(int i=first;i<last;i++){
				int offset=i-first;
				
				int top=img[first][i];
				//top<-left
				img[first][i]=img[last-offset][first];
				//left<-bottom
				img[last-offset][first]=img[last][last-offset];
				//bottom<-right
				img[last][last-offset]=img[i][last];
				//right<-top
				img[i][last]=top;
			}
		}
	}
	
	public static void main(String arg[]){
		int[][] img={{0,1,2},{3,4,5},{6,7,8}};
		ImgUtil.printImg(img);
		rotateImg(img,3);
		ImgUtil.printImg(img);

	}
}
