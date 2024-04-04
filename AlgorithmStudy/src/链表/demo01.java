package 链表;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/4 15:14
 */

/**
 * 示例 1：
 *给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 * 输入：head = [1,1,2]
 * 输出：[1,2]
 */


class ListNode {

    int val;
   ListNode next;
   ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class demo01 {


    public static void main(String[] args) {

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur!=null&&cur.next!=null){
            if (cur.val==cur.next.val){
                cur.next=cur.next.next;
            }else {
                cur=cur.next;
            }
        }
        return head;
    }
}
