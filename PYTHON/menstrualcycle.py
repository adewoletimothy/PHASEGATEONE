from datetime import datetime
from datetime import date


def start_date(date):

	start_date = "01/03/25"

	her_start_date = datetime.strptime(start_date , "%d/%m/%y").date()

	format_her_start_date = her_start_date.fromisoformat("2025-03-01")

	return format_her_start_date
		


def end_date(date):

	end_date = "29/03/25"
	
	her_end_date = datetime.strptime(end_date , "%d/%m/%y").date()

	format_her_end_date = her_end_date.fromisoformat("2025-03-29")

	return format_her_end_date
