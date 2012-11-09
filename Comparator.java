public class Comparator {

	public int getMax(int n, int m) {
		double d1 = (double) n;
		double d2 = (double) m;
		double result = getMax(d1, d2);
		int intResult = (int) result;
		return intResult;
	}
	
	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}
	
	public String getMax(String number1, String number2) {
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		int result = getMax(n1, n2);
		String sResult = Integer.toString(result);
		return sResult;
	}		

}



/**
* if (n1 > n2) {
*			return number1;
*		} else {
*			return number2;
*		}
* Removed from String getMax(String number1, String number2) method.
*/

