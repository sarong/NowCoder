package Question5;
/*
    public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution5 {
   /* 输入一个链表，输出该链表中倒数第k个结点。*/
   public ListNode FindKthToTail(ListNode head,int k) {
       if(head == null||k == 0){
           return null;
       }
    ListNode p = head;
    ListNode q = head;
    for(int i=0;i<k;i++){
        if(p==null){
            return null;
        }
        p=p.next;
    }
    while(p!=null){
        q=q.next;
        p=p.next;
    }
    return q;
   }
}
