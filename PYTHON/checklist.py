
customer_name  = input("What is the customer's name? \n")

item_purchased = []

item_qty = []

item_price = []

total_cost = []

run = True

while(run):

	user_purchase = input("What did the user buy?\n")

	item_purchased.append(user_purchase)

	purchase_qty = int(input("How many pieces? \n"))

	item_qty.append(purchase_qty)

	purchase_price = int(input("How much per unit? \n"))

	item_price.append(purchase_price)

	cost = purchase_qty  * purchase_price

	total_cost.append(cost)

	request_add = input("Add more items? y/n \n").lower()

	while (request_add == 'y'):
	
		user_purchase = input("What did the user buy? \n")

		item_purchased.append(user_purchase)

		purchase_qty = int(input("How many pieces? \n"))

		item_qty.append(purchase_qty)

		purchase_price = int(input("How much per unit?\n "))

		item_price.append(purchase_price)

		cost = purchase_qty  * purchase_price

		total_cost.append(cost)

		request_add = input("Add more items? y/n  \n").lower()


	cashier_name = input("What is your name?\n")

	discount = float(input("How much discount will the buyer get?\n"))

	total_sum = sum(total_cost)

	discounted_price = discount / 100 * total_sum

	vat_price = (17.5 / 100) * total_sum

	final_price = total_sum - discounted_price + vat_price

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
print("======================================================")
print(f"{'':5}{'ITEM':<15}{'QTY':<10}{'PRICE':<15}{'TOTAL(NGN)':<15}")
print("-------------------------------------------------------") 

for item in range(len(item_purchased)):
	print(f"{'':5}{item_purchased[item]:<15} {item_qty[item]:<10}{item_price[item]:<15,.2f}{total_cost[item]:<15,.2f}")	

print("-------------------------------------------------------") 

print(f"{'':<25}{'Sub Total:':<10}{total_sum:<5,.2f}")
print(f"{'':<25}{'Discount:':<10}{discounted_price:<5,.2f}")
print(f"{'':<25}{'VAT @17.50%:':<10}{vat_price:<5,.2f}")
print("======================================================")
print(f"{'':<25}{'Bill Total:':<10}{final_price:<5,.2f}")
print("======================================================")
print(f"THIS IS NOT A RECEIPT. KINDLY PAY {final_price}")
print("======================================================")


user_payment= int(input("How much did the customer give to you?"))

print(invoice)
print(f"Cashier: {cashier_name}")
print(f"Customer Name: {customer_name}")
print("======================================================")
print(f"{'':5}{'ITEM':<15}{'QTY':<10}{'PRICE':<15}{'TOTAL(NGN)':<15}")
print("-------------------------------------------------------") 

for item in range(len(item_purchased)):
	print(f"{'':5}{item_purchased[item]:<15} {item_qty[item]:<10}{item_price[item]:<15,.2f}{total_cost[item]:<15,.2f}")	

print("-------------------------------------------------------") 

print(f"{'':<25}{'Sub Total:':<10}{total_sum:<5,.2f}")
print(f"{'':<25}{'Discount:':<10}{discounted_price:<5,.2f}")
print(f"{'':<25}{'VAT @17.50%:':<10}{vat_price:<5,.2f}")
print("======================================================")
print(f"{'':<25}{'Bill Total:':<10}{final_price:<5,.2f}")
print(f"{'':<25}{'Amount paid:':<10}{user_payment:<5,.2f}")

balance = user_payment - final_price 
print(f"{'':<25}{'Balnce:':<10}{balance:<5,.2f}")
print("======================================================")
print(f"{'':<10}THANK YOU FOR YOUR PATRONAGE.")
print("======================================================")







