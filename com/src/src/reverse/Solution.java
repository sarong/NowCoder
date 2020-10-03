package src.reverse;

/*
 * 反转链表：
 *       1.定义两个指针，一个指向头节点，一个指向头节点的下一个节点
 *       2.将头结点的下一个节点插入到链表头
 *
 * */
public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode pnode = head;
        ListNode nnode = head;
        while (nnode != null || nnode.next != null) {
            pnode = pnode.next;
            nnode = nnode.next.next;
            if (pnode == nnode) {
                return true;
            }
        }
        return false;
    }

}
