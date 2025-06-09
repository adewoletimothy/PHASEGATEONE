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


	public static long menstrualCycle(LocalDate startDate, LocalDate endDate){

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

	startDate = LocalDate.parse("01/03/25", formatter);
        
	endDate = LocalDate.parse("29/03/25", formatter);

        long daysInBetween = ChronoUnit.DAYS.between(startDate, endDate);

	return daysInBetween;
	}


	public static LocalDate ovulationDay(LocalDate ovulaton){

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

	LocalDate endDate = LocalDate.parse("29/03/25", formatter);

	LocalDate sheOvulates = endDate.minusDays(14);

	return sheOvulates;

	}

	public static LocalDate fertileWindowStart(LocalDate fertile){

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

	LocalDate endDate = LocalDate.parse("29/03/25", formatter);

	LocalDate sheOvulates = endDate.minusDays(14);

	LocalDate fertileWindowsStart = sheOvulates.minusDays(5);

	return fertileWindowsStart;

	}

	public static LocalDate fertileWindowEnds(LocalDate fertile){

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

	LocalDate endDate = LocalDate.parse("29/03/25", formatter);

	LocalDate sheOvulates = endDate.minusDays(14);

	LocalDate fertileWindowsEnd = sheOvulates.plusDays(2);

	return fertileWindowsEnd;

	}


}