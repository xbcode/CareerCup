package com.littlemelon.cracking.ch2.q1;

import java.util.Hashtable;

import com.littlemelon.cracking.utils.*;

public class DeleteDuplicate {
	public static void deleteSingleDuplicate(SingleNode head){
		Hashtable ht=new Hashtable();
		SingleNode n=head;
		SingleNode previous=null;
		while(n!=null){
			if(ht.containsKey(n.data)){
				previous.next=n.next;
			}
			else{
				ht.put(n.data, true);
				previous=n;
			}
			n=n.next;
		}
	}
	public static void deleteSingleDuplicateNoBuffer(SingleNode head){
		if(head==null) return;
		SingleNode current=head;
		SingleNode runner=current;
		while(current!=null){
			runner=current;
			while(runner.next!=null){
				if(current.data==runner.next.data){
					runner.next=runner.next.next;
				}
				else{
					runner=runner.next;
				}
			}
			current=current.next;
		}
	}
}
