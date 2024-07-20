package LinkedListPrograms;

class node1
{
	int data;
	node1 next;
		
	// stack is last in first out so insert element at beg
	node1 push(int d, node1 head)
	{
		node1 ob = new node1();
		ob.data=d;
		ob.next=null;
		
		ob.next=head;
		head=ob;
		
		return head;
	}
	
	//pop operation of stack
	node1 pop(node1 head)  // used to delete node from begining.
	{
		head=head.next;
		return head;
	}

	void peek(node1 head)
	{
		node1 temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}
}

public class stackusinglinkedlist {

	public static void main(String[] args) {
		
		node1 head=null;
		node1 obj=new node1();
		
		head=obj.push(1, head);
		head=obj.push(2, head);
		head=obj.push(3, head);
		head=obj.push(4, head);
		head=obj.pop(head);
		obj.peek(head);			
	}
}