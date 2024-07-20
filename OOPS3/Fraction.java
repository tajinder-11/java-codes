package OOPS3;

public class Fraction {

	private int numerator, denominator;

	Fraction() {
		numerator = 0;
		denominator = 1;
	}

	Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		standardized();
		reduce();
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public int getDenominator() {
		return denominator;
	}

	public String toString() {
		return "[" + numerator + "/" + denominator + "]";
	}

	void standardized() {
		if (this.getDenominator() < 0) {
			numerator = numerator * -1;
			denominator = denominator * -1;
		}
	}

	void reduce() // to reduce values for example = 10 / 2 = 5,1.
	{

		int x = Math.abs(numerator);
		int y = Math.abs(denominator);
		int min = x < y ? x : y;
		int i;

		for (i = min; i >= 1; i--) {
			if (x % i == 0 && y % i == 0) {
				numerator = numerator / i;
				denominator = denominator / i;
				break;
			}
		}

	}
	double toDouble()
	{
	    return (double)numerator/denominator;
	}
}
