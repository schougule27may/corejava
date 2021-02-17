package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VendingMachine {

	public Integer totalBillAmountAsPerItemspuchased(List<Integer> productCodes) {

		List<Integer> ListofBills = productCodes.stream().map(this::getProductDetails).collect(Collectors.toList());

		Integer totalBillAmount = ListofBills.stream().reduce(0, (a, b) -> a + b);

		return totalBillAmount;
	}

	public List<Integer> changesToReturn(Integer totalBillAmount, Integer amountRecieved) {
		List<Integer> changesList = new ArrayList<Integer>();
		if (amountRecieved < totalBillAmount) {
			changesList.add(111111);
		} else {

			Integer changes = amountRecieved - totalBillAmount;

			Boolean flag = true;
			while (flag) {
				if (changes > 50) {
//						changesList.add((changes)/50);
					changesList.add(50);
					changes = changes - 50;
					if (changes > 5) {
						flag = true;
					} else {
						flag = false;
					}
				} else if (changes >= 25) {
//						changesList.add((changes)/25);
					changesList.add(25);
					changes = changes - 25;
					if (changes > 5) {
						flag = true;
					} else {
						flag = false;
					}
				} else if (changes >= 10) {
//						changesList.add((changes)/10);
					changesList.add(10);
					changes = changes - 10;
					if (changes > 5) {
						flag = true;
					} else {
						flag = false;
					}
				} else if (changes >= 5) {
//						changesList.add((changes)/5);
					changesList.add(5);
					changes = changes - 5;
					if (changes > 5) {
						flag = true;
					} else {
						flag = false;
					}
				}

			}
		}
		return changesList;
	}

	public Integer refund(Integer amountRecieved) {
		return amountRecieved;
	}

	private Integer getProductDetails(Integer x) {
		Integer price = null;
		switch (x) {
		case 1:
			// Air Max Plus(125)
			price = 125;
			break;
		case 2:
			// Epic React Flynit (150)
			price = 150;
			break;
		case 3:
			// Air VaporMax Flyknit 2 (190)
			price = 190;
			break;

		case 4:
			// Air Max 270 (150)
			price = 150;
			break;

		case 5:
			// Zoom Stefan Janoski (85)
			price = 85;
			break;

		case 6:
			// Epic React Flynit (150)
			price = 125;
			break;
		default:
			price = 0;
		}
		return price;
	}

	public static void main(String[] args) {

		VendingMachine vendingMachine = new VendingMachine();

		// customer will enter the product code and it will get stored in
		// productPurchased list
		Scanner scan = new Scanner(System.in);
		List<Integer> productPurchased = new ArrayList<Integer>();
		String newLine = System.getProperty("line.separator");
		System.out.print("Type CODE for items you want to purchase from following avalable item list :" + newLine
				+ "1 : for Air Max Plus(125)" + newLine + "2 : for Epic React Flynit (150)" + newLine
				+ "3 : for Air VaporMax Flyknit 2 (190)" + newLine + "4 : FOr Air Max 270 (150)" + newLine
				+ "5 : for Zoom Stefan Janoski (85)" + newLine + "6 : for Epic React Flynit (125)" + newLine + newLine);
		System.out.println("(EOF or non-integer to terminate): ");

		while (scan.hasNextInt()) {
			productPurchased.add(scan.nextInt());
		}

		Integer[] nums = productPurchased.toArray(new Integer[0]);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(" " + nums[i]);
		}

		// after entering the products, customer will press the Purchase button and
		// below total amount will get displayed on screen
		Integer totalBill = vendingMachine.totalBillAmountAsPerItemspuchased(productPurchased);

		System.out.print("total bill amount: " + totalBill + newLine);

		Scanner scan1 = new Scanner(System.in);

		int totalBillRounding = totalBill;
		totalBillRounding = Math.round((float) totalBillRounding / 10f) * 10;

		System.out.print(
				"please Pay totalBillRounding Exact amount of :" + totalBillRounding + " (or increment of 10) :- ");

		// This method reads the number provided using keyboard
		int amountPaidByCustomer = scan1.nextInt();
		if (amountPaidByCustomer < totalBillRounding) {
			System.out.print(
					"insuffient balance. please enter the amount :" + totalBillRounding + " (Restart application) ");
			System.exit(0);
		}
//
//		after purchasing , based on totalamount it will ask customer pay the amonut , let say for this case customer will give 900 , then vending machine will return listOfChangestoReturn
		List<Integer> listOfChangestoReturn = vendingMachine.changesToReturn(totalBill, amountPaidByCustomer);

		// if user cancel the order , vending machine cancel order button pressed after
		// receving amount
		List<Integer> listOfChangestoReturnIncaseOrderIsCancelled = vendingMachine.changesToReturn(0,
				amountPaidByCustomer);

		System.out.println(newLine +"Thank you for shoping with us: Order Summery " + newLine + "totalBill = "
				+ totalBill + newLine + "Amount Recived : " + amountPaidByCustomer + newLine + "changes : " + listOfChangestoReturn);
	}

}
