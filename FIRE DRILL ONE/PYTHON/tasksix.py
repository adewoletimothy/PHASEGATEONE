for count in range(1,11):
	if count % 4 == 0:
		print(count , end=' ')
		fix_count = count
		for counter in range(1,5):
			multiple = count * fix_count
			print(multiple , end= ' ')
			count = multiple
