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

	double discount = scanner.nextDouble();

	double totalSum = 0.0;
	for(int cp = 0; cp < totalCost.size(); cp++){
		totalSum += totalCost.get(cp);		
		}

	double discountedPrice = (discount / 100) * totalSum;

	System.out.print(discountedPrice);

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

System.out.printf("%-25s  Sub Total: %-5.2f%n" , "" , totalSum);
System.out.printf("%-25s  Discount:%-5.2f%n" , "" , discountedPrice);
System.out.printf("%-25s  VAT @17.50/100:%-5.2f%n" , "" , vatPrice);
System.out.println("======================================================");
System.out.printf("%-25s Bill Total:%-5.2f%n" , "" , finalPrice);
System.out.println("======================================================");
System.out.printf("%-10s THIS IS NOT A RECEIPT. KINDLY PAY %.2f%n" , "" , finalPrice);
System.out.println("======================================================");


System.out.println("How much did the customer give to you?");
double userPayment = scanner.nextDouble();
while (userPayment < finalPrice){
	System.out.print("Incomplete payment. Enter payment: ")
		userPayment = scanner.nextDouble();
}

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

System.out.printf("%-25s  Sub Total: %-5.2f%n" , "" , totalSum);
System.out.printf("%-25s  Discount:%-5.2f%n" , "" , discountedPrice);
System.out.printf("%-25s  VAT @17.50/100:%-5.2f%n" , "" , vatPrice);
System.out.println("======================================================");
System.out.printf("%-25s Bill Total:%-5.2f%n" , "" , finalPrice);
System.out.println("======================================================");

System.out.printf("%-25s Amount paid:%-5.2f%n" , "" ,  userPayment);

double balance = userPayment - finalPrice; 

System.out.printf("%-25s Balance:%-5.2f%n" , "" , balance);
System.out.println("======================================================");
System.out.printf("%-25s THANK YOU FOR YOUR PATRONAGE." , "");
System.out.println();
System.out.println("======================================================");


	run = false;
	}


	}


}

