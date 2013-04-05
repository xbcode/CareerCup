package com.littlemelon.craking.ch1.q6;

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
	
	public static void printImg(int[][] img,int n){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
			{
				System.out.print(img[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String arg[]){
		int[][] img={{0,1,2},{3,4,5},{6,7,8}};
		printImg(img,3);
		rotateImg(img,3);
		printImg(img,3);

	}
}
