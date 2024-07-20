package Practice;


class gagan
{
	int data;
	gagan next;
	
	gagan enterfront(int id , gagan head)
	{
		
		gagan newnode = new gagan();
		
		newnode.data = id;
		newnode.next = null;
		
		if(head == null)
		{
			head = newnode;
			return head;
		}
		
		gagan temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = newnode;
		return head;	
	}
	
	void show(gagan head)
	{
		while(head != null)
		{
			
			System.out.println(head.data);
			head = head.next;
		}
	}
}
public class myQueue {

	public static void main(String[] args) {
		
     gagan head = null;
     
     gagan obj = new gagan();
     head = obj.enterfront(12 , head);
     head = obj.enterfront(13 , head);
     head = obj.enterfront(14 , head);
     head = obj.enterfront(15 , head);
     head = obj.enterfront(16 , head);
     
     obj.show(head);
     
     
	}

}
