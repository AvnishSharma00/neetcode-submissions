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
    public int gcd(int a,int b){
          while(b!=0){
              int temp=a%b;
              a=b;
              b=temp;
          }
          return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
           if(head==null || head.next==null){
              return head;
           }
           ListNode temp=head;
           while(temp!=null && temp.next!=null){
                int gcds=gcd(temp.val,temp.next.val);
                ListNode newNode=new ListNode(gcds);
                ListNode temp1=temp.next;
                temp.next=newNode;
                newNode.next=temp1;
                temp=temp.next.next;
           }
           return head;
    }
}