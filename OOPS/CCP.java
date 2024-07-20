package OOPS;
/*
 Constructor aapne aap call hunde a te fr jdo apa child class da object bnaya os velle  ta child 
 class wale constructor nu call jaugi pr oh keh rha a ki pehla super class wale constructor nu ta 
 call krwa lai, so eh kmm krwaun lyi apa ne super keyword da use child class de constructor vich kitta
 jo ki pehla call parent class de constructor nu bhej deuga fr aapne aap nu call hon dauga.
*/
class GG
{
	GG(int x)
	{
		System.out.println("x = " + x);
	}
}
public class CCP  extends GG
{
	CCP(int y , int z)
	{
		super(y);   // super keyword used to call super class 
		System.out.println("y = " + y);
	}
	public static void main(String[] args) {
		
		CCP obj = new CCP(90 , 80);
	}

}
