import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class MenstrualCalendarTest{

	@Test
	public void testStartDateFunction(){  
	MenstrualCycleFunctions.startDate(LocalDate.of(01,03,25));
	}

	@Test
	public void testStartDateFunctionReturnsFormattedDate(){ 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
	LocalDate actual = MenstrualCycleFunctions.startDate(LocalDate.of(01,03,25));
	LocalDate expected = LocalDate.parse("01/03/25", formatter);
	assertEquals(actual, expected);
	}

	@Test
	public void testEndDateFunction(){  
	MenstrualCycleFunctions.endDate(LocalDate.of(29,03,25));
	}

	@Test
	public void testEndDateFunctionReturnsFormattedDate(){ 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
	LocalDate actual = MenstrualCycleFunctions.endDate(LocalDate.of(29,03,25));
	LocalDate expected = LocalDate.parse("29/03/25" , formatter);
	assertEquals(actual, expected);
	}

	@Test
	public void testReturnDaysBetweenStartAndEndDate(){ 
	long actual = MenstrualCycleFunctions.menstrualCycle(LocalDate.of(01,03,25) , LocalDate.of(29,03,25));
	long expected = 28; 
	assertEquals(actual, expected);
	}

	@Test
	public void testReturnOvulationDay(){ 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
	LocalDate actual = MenstrualCycleFunctions.ovulationDay(LocalDate.of(15,03,25));
	LocalDate expected =  LocalDate.parse("15/03/25" , formatter);
	assertEquals(actual, expected);
	}


	@Test
	public void testReturnFertileWindowStarts(){ 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
	LocalDate actual = MenstrualCycleFunctions.fertileWindowStart(LocalDate.of(10,03,25));
	LocalDate expected =  LocalDate.parse("10/03/25" , formatter);
	assertEquals(actual, expected);
	}

	@Test
	public void testReturnFertileWindowEnds(){ 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
	LocalDate actual = MenstrualCycleFunctions.fertileWindowEnds(LocalDate.of(17,03,25));
	LocalDate expected =  LocalDate.parse("17/03/25" , formatter);
	assertEquals(actual, expected);
	}

}

