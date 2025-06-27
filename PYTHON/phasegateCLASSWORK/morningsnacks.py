
my_list = [10, 20, 30, 40, 50]

def access_third_element():
    for element in my_list:
        if element == my_list[3]:
            return element


def to_change_last_item_in_list():
    color_list = ['red', 'green', 'blue']
    for element in color_list:
        if element == color_list[2]:
            color_list.append('yellow')
    return color_list

def to_add_purple():
    color_list = ['red', 'green', 'blue']
    color_list.append('purple')
    return color_list

def remove_third_element():
    number_list = [1,2,3,4,5]
    for element in number_list:
        if element == number_list[3]:
            number_list.remove(element)
            return number_list

def length_of_list_element():
    name_list = ['Alice', 'Bob', 'Charlie']
    length_list = []
    for element in name_list:
        length = len(element)
        length_list.append(length)
    return length_list


def ascending_order():
    number_list = [4,1,3,9,2]
    number_list.sort(reverse=False)
    return number_list

def return_list_of_even_numbers():
    number_list = [1,2,3,4,5,6,7,8,9,10]
    even_numbers = number_list[1:10:2]
    return even_numbers


def return_combined_list():
    a_list = [1,2,3]
    b_list = [4,5,6]
    sum_of_lists = a_list + b_list
    return sum_of_lists

def more_than_three_letter_words():
    a_list = ["lamb", "kings", "dogs", "kit", "man"]
    more_than_three_letter_words_list = []
    for element in a_list:
        if len(element) > 3:
            more_than_three_letter_words_list.append(element)
    return more_than_three_letter_words_list



