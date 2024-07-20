package LinkedListPrograms;

class node
{
	int data;
	node next; // next naam da object nvia nvia nodes de address nu store krn de kamm aauga.

	node insertEnd(int d, node head)
	{
		node newnode = new node();  // nvia nodes chipkaun lai object bnaya.
		newnode.data = d;          //  new node da data part.
		newnode.next = null;      //   new node da refrence ala part initially null.
		
		if(head==null) // jekar head ch null pya aa ta nvi node chipka deo.
		{
			head = newnode;
			return head;
		}
		
		
		node temp = head;
		while(temp.next != null) // jekar head null nhi a ta next node da reference head ch pa deo jis naal ik hor node chipak jani a.
		{
			temp = temp.next;  // traverse krna ehne next node nu.
		}
		temp.next = newnode;  // fr os node de baad nvi node nu chipkaun lai aah km krna a.
		return head;
	}
	
	void display(node head)
	{ 
		node temp = head;
		while(temp != null) // jdo tk temp null ni ho janda means nodes mukk ni jandia td tk traverce kri jao and printing v kri jao.
		{
		  System.out.print(temp.data + " ");
		  temp = temp.next;
		}
	}
}


public class linkedlist1 {

	public static void main(String[]args)
	{
		node head = null;       //ik head bnauna a jo initially null houga
		node obj = new node(); // node class da object bnauna pauga kyunki os de andar de function v access krne a.
		int d = 10;
		head = obj.insertEnd(d , head);
		d = 20;
		head = obj.insertEnd(d , head);
		d = 30;
		head = obj.insertEnd(d , head);
		obj.display(head);
	}
}
