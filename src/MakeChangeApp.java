import java.util.Scanner;
import java.lang.Math;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double cashOut;
		int cashOutInt;
		String quit = "";

		System.out.println("Welcome to MakeChange!");

		do {
			System.out.print("Please enter the total amount of the transaction: ");
			double price = kb.nextDouble();
			System.out.print("Enter how much money was tendered by the customer: ");
			double cashIn = kb.nextDouble();

			cashOut = cashIn - price;
			cashOutInt = (int) (Math.round(cashOut * 100));

			if (price > cashIn) {
				System.out.println("Error: Not enough cash to pay for this transaction.");
			} else if (price == cashIn) {
				System.out.println("This is the exact amount of cash to pay for this transaction.");
			} else {
				ProperChange(cashOutInt);
			}
			System.out.println("Enter QUIT to stop or anything else to repeat: ");
			quit = kb.next().toLowerCase();
		} while (!quit.equals("quit"));

		System.out.println("Thank you for using MakeChange. Have a great one!");

		kb.close();
	}

	public static void ProperChange(int cashOutInt) {
		String twentyStr = "", tenStr = "", fiveStr = "", onesStr = "";
		String quarterStr = "", dimeStr = "", nickleStr = "", pennyStr = "";

		if (cashOutInt >= 2000) {
			int twentyCash = (int) (Math.floor(cashOutInt / 2000));
			if (twentyCash > 1) {
				twentyStr = twentyCash + " twenty dollar bills, ";
			} else {
				twentyStr = twentyCash + " twenty dollar bill, ";
			}
			cashOutInt = cashOutInt - 2000 * twentyCash;
		}
		if (cashOutInt >= 1000) {
			tenStr = "1 ten dollar bill, ";
			cashOutInt = cashOutInt - 1000;
		}
		if (cashOutInt >= 500) {
			fiveStr = "1 five dollar bill, ";
			cashOutInt = cashOutInt - 500;
		}
		if (cashOutInt >= 100) {
			int onesCash = (int) (Math.floor(cashOutInt / 100));
			if (onesCash > 1) {
				onesStr = onesCash + " one dollar bills, ";
			} else {
				onesStr = onesCash + " one dollar bill, ";
			}
			cashOutInt = cashOutInt - 100 * onesCash;
		}
		if (cashOutInt >= 25) {
			int quarterCash = (int) (Math.floor(cashOutInt / 25));
			if (quarterCash > 1) {
				quarterStr = quarterCash + " quarters, ";
			} else {
				quarterStr = quarterCash + " quarter, ";
			}
			cashOutInt = cashOutInt - 25 * quarterCash;
		}
		if (cashOutInt >= 10) {
			int dimesCash = (int) (Math.floor(cashOutInt / 10));
			if (dimesCash > 1) {
				dimeStr = dimesCash + " dimes, ";
			} else {
				dimeStr = dimesCash + " dime, ";
			}
			cashOutInt = cashOutInt - 10 * dimesCash;
		}
		if (cashOutInt >= 5) {
			nickleStr = "1 nickle, ";
			cashOutInt = cashOutInt - 5;
		}
		if (cashOutInt > 1) {
			pennyStr = "and " + cashOutInt + " pennies. ";
		} else if (cashOutInt == 1) {
			pennyStr = "and 1 penny. ";
		}

		System.out.println(twentyStr + tenStr + fiveStr + onesStr + quarterStr + dimeStr + nickleStr + pennyStr);
	}
}
