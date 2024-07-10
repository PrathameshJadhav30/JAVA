import java.util.Calendar;
import java.util.TimeZone;

public class JAVA_CALENDER_CLASS {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));


        Calendar d = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(d.getCalendarType());
        System.out.println(d.getTimeZone().getID());



    }



}
