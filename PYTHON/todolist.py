"""
requirements:
1. add a task
2. view task added
3. mark a task as completed
4. delete task
"""
import todolist

tasks = []

def add_task(my_task):
	tasks.append([[] , my_task.lower()])
	return tasks

def view_task():
	for my_task in tasks:
		print(f"{my_task[0]} : {my_task[1]}")

def get_task():
	for my_task in tasks:
		if my_task[1] == "read a chapter":
			print(f"{my_task[0]} : {my_task[1]}")
			return my_task[1]
	return False

def mark_completed(my_task):
	my_task = todolist.get_task()
	my_task[0].append('X')
	return



add_task(tasks)