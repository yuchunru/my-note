
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class ReverseList {
	 public ListNode ReverseList(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}
			ListNode pre = head;
			ListNode cur = head.next;
			pre.next = null;
			ListNode q = null;
			
			while (cur != null) {
				
				q = cur.next;
				cur.next = pre;
				pre = cur;
				cur = q;
				
			}
			return pre;
	    }
}
