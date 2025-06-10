from datetime import datetime , timedelta
from datetime import date


def start_date(date):

	start_date = "01/03/25"

	her_start_date = datetime.strptime(start_date , "%d/%m/%y").date()

	format_her_start_date = her_start_date.strftime("%d/%m/%y")

	return format_her_start_date

def end_date(date):

	end_date = "29/03/25"
	
	her_end_date = datetime.strptime(end_date , "%d/%m/%y").date()

	format_her_end_date = her_end_date.strftime("%d/%m/%y")

	return format_her_end_date

def menstrual_cycle(start_date , end_date):

	her_start_date = datetime.strptime("01/03/25" , "%d/%m/%y").date()

	her_end_date = datetime.strptime("29/03/25", "%d/%m/%y").date()

	menstrual_cycle = (her_end_date - her_start_date).days

	return menstrual_cycle 

def ovulation_day(date):

	her_end_date = datetime.strptime("29/03/25", "%d/%m/%y").date()

	she_ovulates = (her_end_date - timedelta(days=14)).strftime("%d/%m/%y")

	return she_ovulates

def start_fertile_window(date):

	her_end_date = datetime.strptime("29/03/25", "%d/%m/%y").date()

	she_ovulates = her_end_date - timedelta(days=14)

	start_fertile_window = (she_ovulates - timedelta(days=5)).strftime("%d/%m/%y")

	return start_fertile_window

def end_fertile_window(date):

	her_end_date = datetime.strptime("29/03/25", "%d/%m/%y").date()

	she_ovulates = her_end_date - timedelta(days=14)

	end_fertile_window = (she_ovulates + timedelta(days=2)).strftime("%d/%m/%y")

	return end_fertile_window

	
















