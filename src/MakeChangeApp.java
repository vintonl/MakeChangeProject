import java.util.Scanner;
import java.lang.Math;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String twentyStr = "", tenStr = "", fiveStr = "", onesStr = "", quarterStr = "", dimeStr = "", nickleStr = "", pennyStr = "";
		
		System.out.println("Welcome to MakeChange!");
		System.out.print("Please enter the total amount of the transaction: ");
		double price = kb.nextDouble();
		System.out.print("Enter how much money was tendered by the customer: ");
		double cashIn = kb.nextDouble();

		if (price > cashIn) {
			System.out.println("Error: Not enough cash to pay for this transaction.");
		} else if (price == cashIn) {
			System.out.println("This is the exact amount of cash to pay for this transaction.");
		} 

		double cashOut = cashIn - price;
		int cashOutInt = (int)(Math.round(cashOut * 100));

//		System.out.println(cashOutInt);
		
		if (cashOutInt >= 2000) {
			int twentyCash = (int)(Math.floor(cashOutInt / 2000));
			twentyStr =  twentyCash + " twenty dollar bill, ";
			cashOutInt = cashOutInt - 2000 * twentyCash;
		}
		if (cashOutInt >= 1000) {
			int tensCash = (int)(Math.floor(cashOutInt / 1000));
			tenStr = tensCash + " ten dollar bill, ";
			cashOutInt = cashOutInt - 1000 * tensCash;
		}
		if (cashOutInt >= 500) {
			int fivesCash = (int)(Math.floor(cashOutInt / 500));
			fiveStr = fivesCash + " five dollar bill, ";
			cashOutInt = cashOutInt - 500 * fivesCash;
		}
		if (cashOutInt >= 100) {
			int onesCash = (int)(Math.floor(cashOutInt / 100));
			onesStr = onesCash + " one dollar bill, ";
			cashOutInt = cashOutInt - 100 * onesCash;
		}
		if (cashOutInt  >= 25) {
			int quarterCash = (int)(Math.floor(cashOutInt / 25));
			quarterStr = quarterCash + " quarter, ";
			cashOutInt = cashOutInt - 25 * quarterCash;
		}
		if (cashOutInt >= 10) {
			int dimesCash = (int)(Math.floor(cashOutInt / 10));
			dimeStr = dimesCash + " dime, ";
			cashOutInt = cashOutInt - 10 * dimesCash;
		}
		if (cashOutInt >= 5) {
			int nicklesCash = (int)(Math.floor(cashOutInt / 5));
			nickleStr = nicklesCash + " nickle, ";
			cashOutInt = cashOutInt - 5 * nicklesCash;
		}
		if (cashOutInt > 1) {
			pennyStr = "and " + cashOutInt + " pennies. ";
		} else if (cashOutInt == 1) {
			pennyStr = "and 1 penny. ";
		}
		
		
		System.out.println("The correct change is: " + twentyStr + tenStr + fiveStr + onesStr + quarterStr + dimeStr + nickleStr + pennyStr);
		
		System.out.println("Thank you for using MakeChange. Have a great one!");
		kb.close();
	}

}
