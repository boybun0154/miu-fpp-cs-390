package HW2.P2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Event event = new Event();
        System.out.println("Event name:");
        event.setName(sc.nextLine());
        System.out.println("Event date (yyyy-MM-dd):)");
        LocalDate date = LocalDate.parse(sc.nextLine());
        event.setDate(date);
        System.out.println("Event time (HH:mm):");
        LocalTime time = LocalTime.parse(sc.nextLine());
        event.setTime(time);
        System.out.println("Day of the week: "+event.getDate().getDayOfWeek());
        System.out.println("Is leap year: "+event.getDate().isLeapYear());
        System.out.println("Days to the event: "+ ChronoUnit.DAYS.between(LocalDate.now(),event.getDate()));
        format(event);

        // Convert to zonedDateTime - shouldn't have come to this I hate myself
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(date.toString()+"T"+time.toString()
                +ZonedDateTime.now().getOffset()+"["+ZoneId.systemDefault()+"]", DateTimeFormatter.ISO_DATE_TIME);

        System.out.println("Timezone to convert: ");
        String timezone = sc.nextLine();
        ZoneId zoneId = ZoneId.of(timezone);
        System.out.println("Converted time: "+zonedDateTime.withZoneSameInstant(zoneId));
    }

    static void format(Event event) {
        LocalDate date = event.getDate();
        LocalTime time = event.getTime();
        System.out.println(date.getDayOfWeek()+","
                        +date.getMonthValue()+","+date.getYear()+" @ "
                        + time.getHour() +":"+time.getMinute()
                        +" ["+ ZonedDateTime.now().getZone() +"]");
    }
}
