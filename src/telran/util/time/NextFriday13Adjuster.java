package telran.util.time;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class NextFriday13Adjuster implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporal) {
		// TODO
		temporal=getNearest13Day(temporal);
		while(DayOfWeek.from(temporal) != DayOfWeek.FRIDAY){
			temporal=temporal.plus(1, ChronoUnit.MONTHS);
		}
		return temporal;
	}
	// get nearest date with DAY_OF_MOTNTH equals 13
	private Temporal getNearest13Day(Temporal temporal) {
		if(temporal.get(ChronoField.DAY_OF_MONTH) >= 13) {
			temporal = temporal.plus(1, ChronoUnit.MONTHS);
		}
		temporal = temporal.with(ChronoField.DAY_OF_MONTH, 13);
		return temporal;
	}
	// Done
}
