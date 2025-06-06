import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
//import MenstrualCycleFunctions;

public class MenstrualCalendarTest{

	@Test
	public void testStartDate(){  // the test case
	MenstrualCycleFunctions.startDate(LocalDate.of(01,03,25));
	
	}



}

