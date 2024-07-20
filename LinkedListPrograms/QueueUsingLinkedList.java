package LinkedListPrograms;

class queue {
	
	int data;
	queue next;

	queue enqueue(int d, queue head) {
		queue newnode = new queue();

		newnode.data = d;
		newnode.next = null;

		if (head == null) {
			head = newnode;
			return head;
		}

		queue t = head;
		while (t.next != null) {
			t = t.next;
		}
		t.next = newnode;  // navi node chipkaun lyi taam jhaam.
		return head;
	}

	queue dequeue(queue head) { // function to delete a node from begining. 
		head = head.next;
		return head;
	}

	void show(queue head) {
		while (head != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
	}
}

public class QueueUsingLinkedList {

	public static void main(String[] args) {

		queue head = null;
		queue obj = new queue();

		head = obj.enqueue(10, head);
		head = obj.enqueue(20, head);
		head = obj.enqueue(30, head);
		head = obj.enqueue(40, head);
		head = obj.enqueue(50, head);
		head = obj.enqueue(60, head);
		head = obj.enqueue(70, head);
		head = obj.enqueue(80, head);
		head = obj.enqueue(90, head);
		head = obj.enqueue(100, head);

		head = obj.dequeue(head);
		obj.show(head);
	}
}
