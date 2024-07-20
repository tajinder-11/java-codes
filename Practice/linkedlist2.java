package Practice;

class tajinder1
{
	int data;
	tajinder1 next;
	
	tajinder1 enterEnd(int d, tajinder1 head)
	{
	
	 tajinder1 newnode = new tajinder1();
	 
	 newnode.data = d;
	 newnode.next = null;
		
	 if(head == null)
	 {
		 head = newnode;
		 
	 }
	 return head;
	}
	void show(tajinder1 head)
	{
		tajinder1 temp = head;
		
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
}


public class linkedlist2 {

	public static void main(String[] args) {
		
		tajinder1 head = null;
		tajinder1 obj = new tajinder1();
		
	    int d = 12;
        head = obj.enterEnd(d, head);
        obj.show(head);
	}
}
