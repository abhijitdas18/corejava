package algorithm;

import java.text.DecimalFormat;

public class SetDecimalFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary = 3000.998332432;
		
		covertTwoDecimalPalces(salary);

	}

	public static void covertTwoDecimalPalces(double value)
	{
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		System.out.println(df.format(value));
	}
}
