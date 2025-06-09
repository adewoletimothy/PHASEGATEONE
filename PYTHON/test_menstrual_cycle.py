from datetime import datetime
from datetime import date

import menstrualcycle
from unittest import TestCase

class TestMenstrualCycle(TestCase):
	
	def test_start_date_function_exists(self):
		menstrualcycle.start_date("01/03/25")

	def test_start_date_function_returns_correct_format(self):
		actual = menstrualcycle.start_date("01/03/25")
		expected = "2025-03-01"
		self.assertEqual(actual , expected)

	def test_end_date_function_exists(self):
		menstrualcycle.start_date("29/03/25")

	def test_end_date_function_returns_correct_format(self):
		actual = menstrualcycle.start_date("29/03/25")
		expected = "2025-03-29"
		self.assertEqual(actual , expected)
