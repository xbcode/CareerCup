package com.littlemelon.cracking.ch2.q7;

import java.util.Stack;

import com.littlemelon.cracking.utils.SingleNode;

public class IsPalindrome {
	@SuppressWarnings("rawtypes")
	public static boolean isPalindrome(SingleNode head){
		SingleNode fast=head;
		SingleNode slow=head;
		Stack<Integer> stack=new Stack<Integer>();
		while(fast!=null&&fast.next!=null){
			stack.push((Integer)slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null){
			slow=slow.next;
		}
		while(slow!=null){
			int top=stack.pop().intValue();
			if(top!=(Integer)slow.data) return false;
			slow=slow.next;
		}
		return true;
	}
}
