package Practice;

class queue
{
	
	int data;
	queue next;
	
	queue enterQueue(int d , queue head)
	{
		queue newnode = new queue();
		
		newnode.data = d;
		newnode.next = null;
		
		if(head == null)
		{
			head = newnode;
			return head;
		}
		
		queue temp = head;
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = newnode;   // nvi node chipkauni a 
		return head;
	}
	
	queue delete(queue head)
	{
		head = head.next;
		return head;
	}
	
	queue delend(queue head) // function to delete a node from end.
	{
		queue temp = head;
		queue temp2 = null;
		
		while(temp.next != null)
			
		{
			temp2 = temp;
			temp = temp.next;
		}
		temp2.next = null;
		return head;
		
	}
	
	void show(queue head)
	{
		
		while(head != null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
}
public class linklist {

	public static void main(String[] args) {
	
		queue head = null;
		queue obj = new queue();
		
		head = obj.enterQueue(10, head);
		head = obj.enterQueue(20, head);
		head = obj.enterQueue(30, head);
		head = obj.enterQueue(40, head);
		head = obj.enterQueue(50, head);
		head = obj.enterQueue(60, head);
		
		head = obj.delete(head);
		head = obj.delend(head);
		obj.show(head);
		
		
		
		

	}

}
