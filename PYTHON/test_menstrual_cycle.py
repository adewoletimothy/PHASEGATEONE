from datetime import datetime
from datetime import date

import menstrualcycle
from unittest import TestCase

class TestMenstrualCycle(TestCase):
	
	def test_start_date_function_exists(self):
		menstrualcycle.start_date("01/03/25")

	def test_start_date_function_returns_correct_format(self):
		actual = menstrualcycle.start_date("01/03/25")  
		expected = "01/03/25"
		self.assertEqual(actual , expected)

	def test_end_date_function_exists(self):
		menstrualcycle.start_date("29/03/25")

	def test_end_date_function_returns_correct_format(self):
		actual = menstrualcycle.end_date("29/03/25") 
		expected = "29/03/25"
		self.assertEqual(actual , expected)

	def test_menstrual_cycle_function_returns_date(self):
		actual = menstrualcycle.menstrual_cycle("29/03/25" , "01/03/25")
		expected = 28
		self.assertEqual(actual , expected)

