//java

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


public class MenstrualCycleFunctions{

	public static LocalDate startDate(LocalDate date){

	String startDate = "1/03/25";
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy");

	LocalDate herDate = LocalDate.parse(startDate, formatter);

	return herDate;
	}








}