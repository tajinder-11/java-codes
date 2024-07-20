package Practice;

class mynode
{
	int data;
	mynode next;
	
	mynode insertEnd(int d , mynode head)
	{
		mynode newnode = new mynode();
		
		newnode.data = d;
		newnode.next = null;
		
		if(head == null)
		{
			head = newnode;
			return head;
		}
		
		mynode temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = newnode;
		return head;
	}
	
	void display(mynode head)
	{
	  mynode temp = head;
	  while(temp != null)
	  {
		  System.out.println(temp.data);
		  temp = temp.next;
	  }
	}
}
public class linkedlist1 {

	public static void main(String[] args) {
		
		mynode head = null;
		mynode obj = new mynode();
		
		int d = 12;
		head = obj.insertEnd(d, head);
		d = 14;
		head = obj.insertEnd(d, head);
	    obj.display(head);
	}

}
