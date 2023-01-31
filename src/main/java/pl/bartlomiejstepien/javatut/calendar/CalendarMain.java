package pl.bartlomiejstepien.javatut.calendar;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CalendarMain
{
    private static final ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE = Executors.newSingleThreadScheduledExecutor();

    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC+2"));
        System.out.println(calendar.getTime());

        Calendar gregorianCalendar = GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(gregorianCalendar.getTimeZone());

        System.out.println(ZonedDateTime.now().getSecond());

        SCHEDULED_EXECUTOR_SERVICE.scheduleAtFixedRate(() -> {
            System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        }, 0, 1, TimeUnit.SECONDS);
    }
}
