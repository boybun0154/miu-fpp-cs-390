package HW1.demo;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDemo {
    void main() {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().plusDays(1));
        System.out.println(LocalDate.now().plusDays(2));
        System.out.println(LocalDate.now().minus(10, ChronoUnit.DAYS));
        System.out.println(ZonedDateTime.now());
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusWeeks(360)).getChronology());
        IO.println(LocalDate.parse(LocalDate.now().toString(), DateTimeFormatter.ISO_DATE).format(DateTimeFormatter.ofPattern("yyyy/dd/MM")));
    }
}
