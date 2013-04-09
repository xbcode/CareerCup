package com.littlemelon.cracking.ch2.q4;

import com.littlemelon.cracking.utils.SingleNode;

public class Partition {
	public static SingleNode partition1(SingleNode head, int x){
		SingleNode node=head;
		SingleNode beforeStart=null;
		SingleNode beforeEnd=null;
		SingleNode afterStart=null;
		SingleNode afterEnd=null;
		while(node!=null){
			SingleNode next=node.next;
			node.next=null;
			if((int)node.data<x){
				if(beforeStart==null){
					beforeStart=node;
					beforeEnd=beforeStart;
				}
				else{
					beforeEnd.next=node;
					beforeEnd=node;
				}
			}else{
				if(afterStart==null){
					afterStart=node;
					afterEnd=afterStart;
				}
				else{
					afterEnd.next=node;
					afterEnd=node;
				}
			}
			node=next;
		}
		if(beforeStart==null) return afterStart;
		beforeEnd.next=afterStart;
		return beforeStart;
	}
	
	public static SingleNode partition2(SingleNode node, int x){
		SingleNode beforeStart=null;
		SingleNode afterStart=null;
		while(node!=null){
			SingleNode next=node.next;
			if((int)node.data<x){
				node.next=beforeStart;
				beforeStart=node;
			} else{
				node.next=afterStart;
				afterStart=node;
			}
			node=next;
		}
		if(beforeStart==null) return afterStart;
		SingleNode head=beforeStart;
		while(beforeStart.next!=null){
			beforeStart=beforeStart.next;
		}
		beforeStart.next=afterStart;
		return head;
	}
}
