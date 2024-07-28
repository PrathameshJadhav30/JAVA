import java.util.GregorianCalendar;
import java.util.TimeZone;

public class JAVA_GREGORIAN_CALENDER {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2024));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}


