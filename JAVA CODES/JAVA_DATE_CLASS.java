import java.util.Date;

public class JAVA_DATE_CLASS {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
    }

}
