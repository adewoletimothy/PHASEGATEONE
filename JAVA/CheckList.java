import java.util.Scanner;
import java.util.ArrayList;


public class CheckList{
	
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.println("What is the customer's name?");
	
	String customerName  = scanner.nextLine();

	ArrayList<String> itemPurchased = new ArrayList<>();

	ArrayList<Integer> itemQty = new ArrayList<>();

	ArrayList<Double> itemPrice = new ArrayList<>();

	ArrayList<Double> totalCost = new ArrayList<>();

	boolean run = true;

	while(run){
		
		System.out.println("What did the user buy?");

		String userPurchase = scanner.nextLine();

		itemPurchased.add(userPurchase);
	
		System.out.println("How many pieces?");

		int purchaseQty = scanner.nextInt();

		itemQty.add(purchaseQty);

		System.out.println("How much per unit?");	
	
		double purchasePrice = scanner.nextDouble();

		itemPrice.add(purchasePrice);

		double cost = purchaseQty  * purchasePrice;

		totalCost.add(cost);

			System.out.print("Add more items? Yes/No \n");
	
			String requestAdd = scanner.next().toLowerCase();

			while (requestAdd.equals("yes")){
			
				System.out.println("What did the user buy?");

				userPurchase = scanner.next();

				itemPurchased.add(userPurchase);
	
				System.out.println("How many pieces?");

				purchaseQty = scanner.nextInt();

				itemQty.add(purchaseQty);

				System.out.println("How much per unit?");	
	
				purchasePrice = scanner.nextDouble();

				itemPrice.add(purchasePrice);

				cost = purchaseQty  * purchasePrice;

				totalCost.add(cost);

				System.out.print("Add more items? Yes/No \n");

				requestAdd = scanner.next().toLowerCase();
			}


	System.out.println("What is your name?");

	String cashierName = scanner.next();

	System.out.println("How much discount will the buyer get?");

	int discount = scanner.nextInt();

	int totalSum = 0;
	for(int cp = 0; cost < totalCost.size(); cost++){
	
		totalSum += totalCost.get(cp);		

		}

	double discountedPrice = discount / 100 * totalSum;

	double vatPrice = (17.5 / 100) * totalSum;

	double finalPrice = totalSum - discountedPrice + vatPrice;

	


String invoice = """
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA LAGOS.
TEL: 03243523231
Date: 10/Jun/2025 9:00:23 pm
""";
System.out.println();
System.out.println(invoice);
System.out.printf("Cashier: %s%n" , cashierName);
System.out.printf("Customer Name: %s%n" , customerName);
System.out.println("==========================================================="); 



System.out.printf("%-5s %-15s %-10s %-15s %-15s%n", "", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
System.out.println("------------------------------------------------------------");

for (int item = 0; item < itemPurchased.size(); item++){
	System.out.printf("%-5s %-15s %-10d %-15.2f %-15.2f%n" , "" ,  itemPurchased.get(item) , itemQty.get(item) , itemPrice.get(item) , totalCost.get(item));
}

System.out.println("------------------------------------------------------------"); 

System.out.printf("%-25s  Sub Total: %-5d%n" , "" , totalSum);
System.out.printf("%-25s  Discount:%-5.2f%n" , "" , discountedPrice);
System.out.printf("%-25s  VAT @17.50%:%-5.2f%n" , "" , vatPrice);
System.out.println("======================================================");
System.out.printf("%-25s Bill Total:%-5.2f%n" , "" , finalPrice);
System.out.println("======================================================");
System.out.printf("%-10s THIS IS NOT A RECEIPT. KINDLY PAY %.2f" , finalPrice);
System.out.println("======================================================");

run = false;
}

/*
userPayment= parseInt(prompt("How much did the customer give to you?"\n))

onsole.log("SEMICOLON STORES")
console.log("MAIN BRANCH")
console.log("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA LAGOS.")
console.log("TEL: 03243523231")
console.log("Date: 10/Jun/2025 9:00:23 pm")
console.log("Cashier: " + cashierName);
console.log("Customer Name: " + customerName);
console.log("======================================================");
console.log(`${''.padEnd(5)} $ {'ITEM'.padEnd(15)} $ {'QTY'.padEnd(10)} $ {'PRICE'.padEnd(15)} $ {'TOTAL(NGN)'.padEnd(15)}`);
console.log("-------------------------------------------------------");

for (let item = 0; item < itemPurchased.length; item++){
	console.log(`${"".padEnd(5)} $ {itemPurchased[item].padEnd(15)} $ {itemQty[item].padEnd(10)} $ {itemPrice[item].toFixed(2).padEnd(15)} $ {totalCost[item].toFixed(2).padEnd(15)}`);
}

console.log("-------------------------------------------------------") 

console.log(`${''.padEnd(25)} $ {'Sub Total:'.padEnd(10)} $ {totalSum.toFixed(2).padEnd(5)}`)
console.log(`${''.padEnd(25)} $ {'Discount:'.padEnd(10)} $ {discountedPrice.toFixed(2).padEnd(5)}`)
console.log(`${''.padEnd(25)} $ {'VAT @17.50%:'.padEnd(10)} $ {vatPrice.toFixed(2).padEnd(5)}`)
console.log(`${''.padEnd(25)} $ {'Bill Total:'.padEnd(10)} $ {finalPrice.toFixed(2).padEnd(5)}`)
console.log("======================================================")
console.log(`${''.padEnd(25)} $ {'Amount paid:'.padEnd(10)} $ {userPayment.toFixed(2).padEnd(5)}`)

balance = userPayment - finalPrice 

console.log(`${''.padEnd(25)} $ {'Balnce:'.padEnd(10)} $ {balance.toFixed(2).padEnd(5)}`)
console.log("======================================================")
console.log(`${''.padEnd(10)} THANK YOU FOR YOUR PATRONAGE.`)
console.log("======================================================")
*/


	}


}

