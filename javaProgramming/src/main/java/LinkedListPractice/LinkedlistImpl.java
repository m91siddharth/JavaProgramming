package LinkedListPractice;

public class LinkedlistImpl {
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
		LinkedlistImpl ll = new LinkedlistImpl();
		ll.printList();
		ll.push(5);
		ll.push(4);
		ll.push(2);
		ll.push(1);
		ll.printList();
	}
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
