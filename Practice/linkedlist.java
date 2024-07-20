package Practice;

class node
{
	int data;
	node next;
	
	node insertEnd(int d , node head)
	{
		node newnode = new node();
		
		newnode.data = d;
		newnode.next = null;
		
		if(head == null)
		{
			head = newnode;
			return head;
		}
		node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = newnode;
		return head;
		
	}
	
	node deletebeg(node head) // function to delete from begining from a linked list.
	{
		head = head.next;
		return head;
	}
	
	void show(node head)
	{
		node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}
public class linkedlist {

	public static void main(String[] args) {
		
		node head = null;
		node obj = new node();
		
		int d = 10;
		head = obj.insertEnd(d , head);
	    d = 20;
		head = obj.insertEnd(d , head);
		d = 30;
		head = obj.insertEnd(d, head);
		
		head = obj.deletebeg(head);
		obj.show(head);
	   	

	}

}
