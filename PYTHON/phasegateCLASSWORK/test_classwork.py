import listfunctions
import unittest

class TestClasswork(unittest.TestCase):
    def test_random_number_list_exist(self):
        listfunctions.randomized_list()

    def test_length_of_list(self):
        self.assertEqual(listfunctions.length() , 10)

    def test_sum_odd_numbers(self):
        self.assertEqual(listfunctions.sum_odd_numbers() , 56)

    def test_sum_even_numbers(self):
        self.assertEqual(listfunctions.sum_even_numbers() , 64)

    def test_product_at_every_third_position(self):
        self.assertEqual(listfunctions.product_at_third_position() , 3640)

    def test_the_average_of_lists(self):
        self.assertEqual(listfunctions.average_of_lists() , 8)
