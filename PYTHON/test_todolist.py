import todolist
from unittest import TestCase

class TestTodoList(TestCase):

	def test_that_task_can_be_added(self):
		actual = todolist.add_task("read a chapter")
		expected = ["read a chapter"]
		self.assertEqual(actual , expected)

	def test_that_task_can_be_viewed(self):
		actual = todolist.view_task("read a chapter")
		expected = ["read a chapter"]
		self.assertEqual(actual , expected)