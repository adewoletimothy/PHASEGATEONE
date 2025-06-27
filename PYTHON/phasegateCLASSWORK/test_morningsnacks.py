import morningsnacks
import unittest

class TestMorningSnacks(unittest.TestCase):
    def test_for_third_element(self):
        actual = morningsnacks.access_third_element()
        expected = 40
        self.assertEqual(actual, expected)

    def test_to_change_last_item_in_list(self):
        self.assertEqual(morningsnacks.to_change_last_item_in_list(),  ['red', 'green', 'blue', 'yellow'])

    def test_to_add_purple(self):
        self.assertEqual(morningsnacks.to_add_purple(), ['red', 'green', 'blue', 'purple'])

    def test_to_remove_third_element(self):
        self.assertEqual(morningsnacks.remove_third_element(), [1,2,3,5])

    def test_to_return_length(self):
        self.assertEqual(morningsnacks.length_of_list_element(), [5,3,7])

    def test_to_return_list_of_even_numbers(self):
        self.assertEqual(morningsnacks.return_list_of_even_numbers(), [2,4,6,8,10])

    def test_to_return_combined_list(self):
        self.assertEqual(morningsnacks.return_combined_list(), [1,2,3,4,5,6])

    def test_to_return_list_of_more_than_three_letter_words(self):
        self.assertEqual(morningsnacks.more_than_three_letter_words(), ['lamb', 'kings', 'dogs'])

    def test_ascending_order(self):
        self.assertEqual(morningsnacks.ascending_order(), [1,2,3,4,9])
