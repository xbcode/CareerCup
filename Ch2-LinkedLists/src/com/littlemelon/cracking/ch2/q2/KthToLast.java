package com.littlemelon.cracking.ch2.q2;

import com.littlemelon.cracking.utils.SingleNode;

public class KthToLast {
	public static SingleNode kthToLast(SingleNode head,int k){
		SingleNode runner=head;
		for(int i=0;i<k-1;i++){
			if(runner==null) return null;
			runner=runner.next;
		}
		if(runner==null) return null;
		SingleNode nodek=head;
		while(runner.next!=null){
			nodek=nodek.next;
			runner=runner.next;
		}
		return nodek;
	}
	
	public static int nthToLast(SingleNode head, int k){
		if(head==null){
			return 0;
		}
		int i=nthToLast(head.next,k)+1;
		if(i==k){
			System.out.println(head.data);
		}
		return i;
	}
}
