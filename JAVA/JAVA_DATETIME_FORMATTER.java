import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JAVA_DATETIME_FORMATTER {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dt.format(df);
        System.out.println(myDate);
    }
}
