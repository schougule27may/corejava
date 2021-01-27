package Arrays;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


//DOB == > Days
//Current date = DOB
public class DaysAlive {

    public static void main(String[] args) {

        try {
            LocalDate jamesGoslingsBirthday = LocalDate.of(1990, 5, 27);
            LocalDate today = LocalDate.now();
            System.out.println("Today: " + today);
            int daysAlive = (int) ChronoUnit.DAYS.between(jamesGoslingsBirthday, today);
            System.out.println("daysAlive:-->"+daysAlive);
            System.out.println("yearsAlive:-->"+daysAlive/365);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
