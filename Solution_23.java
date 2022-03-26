import java.util.*;
import java.util.Arrays;
import java.util.LinkedList;

public class Solution_23 {
 public static ListNode head = new ListNode(10);

 public static void main(String[] args) {
  head.next = new ListNode(20);
  head.next.next = new ListNode(30);
  head.next.next.next = new ListNode(40);
  head.next.next.next.next = new ListNode(50);
  ListNode p = head;
  System.out.println("Original Linked list:");
  printList(p);
  System.out.println("\nAfter deleting the fourth node, Linked list becomes:");
  deleteNode(head.next.next.next);
  p = head;
  printList(p);
 }

 public static void deleteNode(ListNode node) {
  if (node.next != null) {
   int temp = node.val;
   node.val = node.next.val;
   node.next.val = temp;

   node.next = node.next.next;
  } else {
   ListNode p = head;
   while (p.next.val != node.val) {
    p = p.next;
   }
   p.next = null;
  }
 }

 static void printList(ListNode p) {

  while (p != null) {
   System.out.print(p.val);
   if (p.next != null) {
    System.out.print("->");
   }
   p = p.next;
  }
 }
}
class ListNode {
 int val;
 ListNode next;

 ListNode(int val) {
  this.val = val;
  this.next = null;
 }
}
