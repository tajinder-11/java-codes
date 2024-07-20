package OOPS3;

public class Driver {

	public static void main(String[] args) {

		Fraction obj1 = new Fraction(1, 2);
		System.out.println(obj1);
		Fraction obj2 = new Fraction(3,2);
		System.out.println(obj2);
		Fraction ans = new Fraction();
		ans = Operation.addition(obj1, obj2);
		
		System.out.println("Addition " + ans);
         if(Operation.isGreater(obj1, obj2))
         {
        	 System.out.println("object1 is greater");
         }
         else
         {
        	 System.out.println("object2 is greater");
         }
         
         if(Operation.isEqual(obj1, obj2))
         {
        	 System.out.println("both objects are equal");
         }
         else
         {
        	 System.out.println("not equal");
         }
	}
}