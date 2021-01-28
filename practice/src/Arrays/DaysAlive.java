package Arrays;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/** This class is a user-defined class that contains one methods cube.*/
//DOB == > Days
//Current date = DOB
public class DaysAlive {
    /** The cube method prints cube of the given number */
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
