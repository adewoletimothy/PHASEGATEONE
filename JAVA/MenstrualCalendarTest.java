import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
//import MenstrualCycleFunctions;

public class MenstrualCalendarTest{

	@Test
	public void testStartDateFunction(){  // the test case
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
	public void testEndDateFunctionReturnsFormattedDate(){ 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
	LocalDate actual = MenstrualCycleFunctions.endDate(LocalDate.of(29,03,25));
	LocalDate expected = LocalDate.parse("29/03/25" , formatter);
	assertEquals(actual, expected);
	}

	@Test
	public void testReturnDaysBetweenStartAndEndDate(){ 
	int actual = MenstrualCycleFunctions.menstrualCycle(01,03,25 , 29,03,25);
	int expected = 28; 
	assertEquals(actual, expected);
	}


}

