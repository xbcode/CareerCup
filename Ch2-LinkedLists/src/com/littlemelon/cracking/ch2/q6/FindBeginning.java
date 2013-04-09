package com.littlemelon.cracking.ch2.q6;

import com.littlemelon.cracking.utils.SingleNode;

public class FindBeginning {
	@SuppressWarnings("rawtypes")
	public static SingleNode findBeginning(SingleNode head){
		SingleNode fast=head;
		SingleNode slow=head;
		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow) break;
		}
		if(fast==null||fast.next==null) return null;
		fast=head;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
}
