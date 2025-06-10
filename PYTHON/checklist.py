#cashier_name

customer_name  = input("What is the customer's name? \n")



item_purchased = []

total_cost = []

run = True

while(run):

	user_purchase = input("What did the user buy?\n")

	item_purchased.append(user_purchase)

	purchase_qty = int(input("How many pieces? \n"))

	purchase_price = int(input("How much per unit? \n"))

	cost = purchase_qty  * purchase_price

	total_cost.append(cost)

	request_add = input("Add more items? y/n  \n").lower()

	while (request_add == 'y'):
	
		user_purchase = input("What did the user buy? \n")

		item_purchased.append(user_purchase)

		purchase_qty = int(input("How many pieces? \n"))

		purchase_price = int(input("How much per unit?\n "))

		cost = purchase_qty  * purchase_price

		total_cost.append(cost)

		request_add = input("Add more items? y/n  \n").lower()


	cashier_name = input("What is your name?\n")

	discount = float(input("How much discount will the buyer get?\n"))

	total_sum = sum(total_cost)

	discounted_price = discount / 100 * total_sum

	total_sum = discounted_price - total_sum

	print(discounted_price)
		
	run = False

invoice = """
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA LAGOS.
TEL: 03243523231
Date: 10/Jun/2025 9:00:23 pm
"""
print(invoice)
print(f"Cashier: {cashier_name}")
print(f"Customer Name: {customer_name}")
print("=====================================================================")
print("			ITEM	QTY		PRICE	TOTAL(NGN)")
print("---------------------------------------------------------------------------------") 





