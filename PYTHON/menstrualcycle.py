from datetime import datetime
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

	
	



















