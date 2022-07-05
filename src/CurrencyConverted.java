import java.util.Scanner;
public class CurrencyConverted {
	public static void main (String args[]) {
		double $ = 78.93;
		double UAE = 21.48;
		double Ruble = 1.42;
		
		Scanner Currency = new Scanner(System.in);
		
		System.out.println("Please Enter the Conversion");
		System.out.println(" 1 for Rupees to Dollar");
		System.out.println(" 2 for Rupees to UAE");
		System.out.println(" 3 for Rupees to Ruble");

		int Rupees = Currency.nextInt();
		if(Rupees == 1) {
			System.out.println("You have Selected Dollars / Enter the Amount in Rupees");
			int INR = Currency.nextInt();
			double converted = INR/$;
			System.out.println("Converted Amount : "+ converted);
		} else if(Rupees == 2) {
			System.out.println("You have Selected UAR / Enter the Amount in Rupees");
			int INR = Currency.nextInt();
			double converted = INR/UAE;
			System.out.println("Converted Amount : "+ converted);
		} else if(Rupees == 3) {
			System.out.println("You have Selected Ruble / Enter the Amount in Rupees");
			int INR = Currency.nextInt();
			double converted = INR/Ruble;
			System.out.println("Converted Amount : "+ converted);
		} else {
			System.out.println("Invalid Selection");
		}			
}
}