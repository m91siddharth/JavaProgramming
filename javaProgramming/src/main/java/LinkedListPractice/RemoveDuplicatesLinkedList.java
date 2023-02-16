package LinkedListPractice;

import java.util.HashSet;

import LinkedListPractice.LinkedlistImpl.Node;

public class RemoveDuplicatesLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesLinkedList ll = new RemoveDuplicatesLinkedList();
		ll.printList();
		ll.push(5);
		ll.push(4);
		ll.push(2);
		ll.push(1);
		ll.push(1);
		ll.removeDuplicates();
		System.out.println("After removing duplicates:");
		ll.printList();
	}
	private void removeDuplicates() {
		// TODO Auto-generated method stub
		HashSet ht = new HashSet();
		Node counter =head, prev=head;
		if(head!=null) {
			while(counter !=  null) {
				System.out.print(counter.data+"->");
				if(ht.contains(counter.data)) {
					if(counter.next == null) {
						prev.next=null;
					}else {
						prev.next=counter.next;
					}
				}else {
					ht.add(counter.data);
				}
				prev=counter;
				counter = counter.next;
			}
		}
	}
//	private void deletedata(Node counter) {
//		// TODO Auto-generated method stub
//		Node tmp=head;
//		Node prev=head;
//		while(tmp.next!= null) {
//			if(tmp==counter) {
//				prev.next = tmp.next;
//			}
//			prev = tmp;
//			tmp = tmp.next;
//		}
//		
//	}
	private void printList() {
		// TODO Auto-generated method stub
		Node counter =head;
		if(head!=null) {
			while(counter !=  null) {
				System.out.print(counter.data+"->");
				counter = counter.next;
			}
		}else {
			System.out.println("List is empty !!");
		}
		
	}
	private void push(int i) {
		// TODO Auto-generated method stub
		Node newNode = new Node(i);
		Node last;
		if(head == null) {
			head = newNode;
		}else {
			last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}
}
