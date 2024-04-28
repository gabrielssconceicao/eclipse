import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-01-01");
        LocalDateTime d05 = LocalDateTime.parse("2022-01-01T01:30:24");
        Instant d06 = Instant.parse("2022-01-01T01:30:24Z");
        // Instant d07 = Instant.parse("2022-01-21T01:30:44-03:00");
        LocalDate d08 = LocalDate.parse("20/07/2021", formatter);

        System.out.println("d01 = " + d01);
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);

        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);

        System.out.println("d08 = " + d08);
    }
}
