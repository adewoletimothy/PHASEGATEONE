import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class MenstrualCycleFunctions{

	public static LocalDate startDate(LocalDate date){

	String startDate = "01/03/25";
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

	LocalDate herStartDate = LocalDate.parse(startDate, formatter);

	return herStartDate;
	}


	public static LocalDate endDate(LocalDate date){

	String endDate = "29/03/25";
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

	LocalDate herEndDate = LocalDate.parse(endDate, formatter);

	return herEndDate;
	}


	public static int menstrualCycle(LocalDate startDate, LocalDate endDate){

	startDate = LocalDate.of(01,03,25);
        
	endDate = LocalDate.of(29,03,25);

        int daysInBetween = (int)ChronoUnit.DAYS.between(startDate, endDate);

	return daysInBetween;
	}



}