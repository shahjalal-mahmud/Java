import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Date01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formateDate = dt.format(formate);
        System.out.println(formateDate);
        DateTimeFormatter formate1 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String formateDate1 = dt.format(formate1);
        System.out.println(formateDate1);

    }
}
