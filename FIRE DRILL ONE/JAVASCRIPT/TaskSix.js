for(let count =1; count <=10; count++){
	if (count % 4 == 0){
	console.log(count)
	let fixCount = count
		for(let counter = 1; counter <= 5; counter++){
			let multiple = count * fixCount
			console.log(multiple + " ")
			count = multiple
		}
	}

}
