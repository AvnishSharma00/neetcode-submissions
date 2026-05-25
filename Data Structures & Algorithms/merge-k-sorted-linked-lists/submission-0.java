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
    public ListNode mergeKLists(ListNode[] lists) {
          PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
          for(ListNode node:lists){
            pq.add(node);
          }
          ListNode temp=new ListNode(-1);
          ListNode dummy=temp;
          while(!pq.isEmpty()){
                ListNode node=pq.poll();
                dummy.next=node;
                dummy=node;
                if(node.next!=null){
                  pq.add(node.next);
                }


          }
          return temp.next;

    }
}
