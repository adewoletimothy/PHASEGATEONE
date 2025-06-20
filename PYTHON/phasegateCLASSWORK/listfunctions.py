import random

number_list = []

def randomized_list():
    for index in range(1,11):
        number = random.randint(1,10)
        number_list.append(number)

randomized_list()
print(number_list)

def length():
    count = 0
    for number in number_list:
        count += 1
    return count

length()
print(length())


my_list = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

def sum_odd_numbers():
    sum_odd = 0
    for index in range(1 , len(my_list), 2):
        sum_odd += my_list[index]
    return sum_odd

print(sum_odd_numbers())

def sum_even_numbers():
    sum_even = 0
    for index in range(0 , len(my_list), 2):
        sum_even += my_list[index]
    return sum_even

print(sum_even_numbers())

def product_at_third_position():
    product = 1
    for index in range(0 , len(my_list), 3):
        product *= my_list[index]
    return product

print(product_at_third_position())

def average_of_lists():
    average = 0
    total = 0
    for index in range(0 , len(my_list)):
        total += my_list[index]
    average = total / len(my_list)
    return average
print(average_of_lists())