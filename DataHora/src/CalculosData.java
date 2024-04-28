import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosData {

  public static void main(String[] args) {
    LocalDate d1 = LocalDate.parse("2022-07-20");
    LocalDateTime d2 = LocalDateTime.parse("2022-07-20T01:30:24");

    Instant d6 = Instant.parse("2022-07-20T01:30:24Z");

    LocalDate pastWeekLocalDate = d1.minusDays(7);
    LocalDate nextWeekLocalDate = d1.plusDays(7);
    System.out.println("d1 = " + d1);
    System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
    System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

    LocalDateTime pastYearLocalDate = d2.minusYears(7);
    LocalDateTime nextMonthLocalDate = d2.plusMonths(7);
    System.out.println("d2 = " + d2);
    System.out.println("pastWeekLocalDate = " + pastYearLocalDate);
    System.out.println("nextWeekLocalDate = " + nextMonthLocalDate);

    Instant pastWeekInstant = d6.minus(7, ChronoUnit.DAYS);
    Instant nextWeekInstant = d6.plus(7, ChronoUnit.DAYS);

    System.out.println("d6 = " + d6);
    System.out.println("pastWeekInstant = " + pastWeekInstant);
    System.out.println("nextWeekInstant = " + nextWeekInstant);

    Duration t1 = Duration.between(pastYearLocalDate, nextMonthLocalDate);

    System.out.println("t1 dias = " + t1.toDays());
    System.out.println("t1 horas = " + t1.toHours());

    Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d1.atTime(0, 0));
    System.out.println("t2 dias = " + t2.toDays());

    Duration t3 = Duration.between(d6, pastWeekInstant);
    System.out.println("t3 dias = " + t3.toDays());
  }

}
