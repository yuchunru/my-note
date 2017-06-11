package swordOffer;

/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/


import java.util.Stack;
import java.util.ArrayList;
public class printListFromTailToHead {
    ArrayList<Integer> a = new ArrayList<Integer>();
    Stack<Integer> st = new Stack<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode p = listNode;
        while(p!=null){
            st.push(p.val);
            p= p.next;
        }
        
        while(!st.isEmpty()){
            
            a.add(st.pop());
        }
       return a;
    }
}