/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
	public static void main(String[] args) {
	    Node head = new Node(1);
	    head.next = new Node(2);
	    head.next.next = new Node(3);
	    head.next.next.next = new Node(4);
	    System.out.println("Originallist");
	    printList(head);
	    head = reverseList(head);
	    System.out.println("Reversedlist");
	    printList(head);
	}
	public static Node reverseList(Node head){
	    Node prev = null;
	    Node curr = head;
	    while(curr!=null){
	        Node next = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr=next;
	    }
	    return prev;
	}
	public static void printList(Node head){
	    Node temp = head;
	    while(temp!=null){
	        System.out.print(temp.data+" ");
	        temp=temp.next;
	    }
	}
	
}
