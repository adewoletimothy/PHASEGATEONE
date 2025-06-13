const prompt = require('prompt-sync')();


let customerName  = prompt("What is the customer's name? \n")

let itemPurchased = [];

let itemQty = [];

let itemPrice = [];

let totalCost = [];

let run = true;

while(run){

	let userPurchase = prompt("What did the user buy?\n")

	itemPurchased.push(userPurchase)

	let purchaseQty = parseInt(prompt("How many pieces? \n"))

	itemQty.push(purchaseQty)

	let purchasePrice = parseInt(prompt("How much per unit? \n"))

	itemPrice.push(purchasePrice)

	let cost = purchaseQty  * purchasePrice

	totalCost.push(cost)

	let requestAdd = prompt("Add more items? y/n \n").toLowerCase();

	while (requestAdd == 'y'){
	
		let userPurchase = prompt("What did the user buy?\n")

		itemPurchased.push(userPurchase)

		let purchaseQty = parseInt(prompt("How many pieces? \n"))

		itemQty.push(purchaseQty)

		let purchasePrice = parseInt(prompt("How much per unit? \n"))

		itemPrice.push(purchasePrice)

		let cost = purchaseQty  * purchasePrice

		totalCost.push(cost)

		let requestAdd = prompt("Add more items? y/n \n").toLowerCase()
		}

	let cashierName = prompt("What is your name?\n")

	let discount = parseInt(prompt("How much discount will the buyer get?\n"))

	let totalSum = totalCost.reduce((a,b) => a + b , 0)

	let discountedPrice = discount / 100 * totalSum

	let vatPrice = (17.5 / 100) * totalSum

	let finalPrice = totalSum - discountedPrice + vatPrice

	run = false
}

console.log("SEMICOLON STORES")
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
console.log("======================================================")
console.log(`${''.padEnd(25)} $ {'Bill Total:'.padEnd(10)} $ {finalPrice.toFixed(2).padEnd(5)}`)
console.log("======================================================")
console.log(`$THIS IS NOT A RECEIPT. KINDLY PAY {finalPrice}`)
console.log("======================================================")


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






