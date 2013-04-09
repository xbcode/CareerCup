package com.littlemelon.cracking.ch2.q3;

import com.littlemelon.cracking.utils.SingleNode;

public class DeleteMiddleNode {
	public static boolean deleteMiddleNode(SingleNode node){
		if(node==null|node.next==null) return false;
		SingleNode next=node.next;
		node.data=next.data;
		node.next=next.next;
		return true;
	}
}
