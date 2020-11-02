/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        
        int length=0;
        ListNode node=head;
    
        while(node!=null)
        {
            ++length;
            node=node.next;
        }
        System.out.println(length);
        
        int sum=0;
        while(head!=null)
        {
            sum=sum+head.val*((int)(Math.pow(2,(length-1))));
        
            System.out.println(length+" : "+head.val+" : "+sum);
            --length;
            head=head.next;
        }
        return sum;
    }
}
