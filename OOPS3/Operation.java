package OOPS3;

/*	
	a     a
	-  +  -
	b     b
	*/
public class Operation {

	static Fraction addition(Fraction obj1, Fraction obj2) {
		Fraction obj = new Fraction();

		obj.setNumerator(obj1.getNumerator() * obj2.getDenominator() + obj1.getDenominator() * obj2.getNumerator());
		obj.setDenominator(obj1.getDenominator() * obj2.getDenominator());
		obj.reduce();
		return obj;
	}

	static boolean isGreater(Fraction obj1, Fraction obj2) {

		double ans1 = obj1.toDouble();
		double ans2 = obj2.toDouble();
		
		if(ans1 > ans2)
		{
			return true;
		}
        return false;
	}
	static boolean isEqual(Fraction obj1, Fraction obj2)
	{
		double ans1 = obj1.toDouble();
		double ans2 = obj2.toDouble();
		if(ans1 == ans2)
		{
			return true;
		}
		return false;
	}
	
}
