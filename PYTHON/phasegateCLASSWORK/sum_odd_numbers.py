import listfunctions

number = [1,4,2,5,6,4,5,8,6,9]

def sum_odd_numbers(number):
    sum_odd = 0
    for index in range(1 , len(number), 2):
        sum_odd += number[index]
    print(sum_odd)
    return sum_odd

sum_odd_numbers(number)