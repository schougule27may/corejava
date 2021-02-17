package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeStamps {

	public String timeDifference(String postDateString) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date postDate = null;

		try {
			postDate = formatter.parse(postDateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Date currentDate = new Date();

		long duration = currentDate.getTime() - postDate.getTime();

		long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
		long diffInDays = TimeUnit.MILLISECONDS.toDays(duration);
		final long weekConst = 7L;
		final long monthConst = 30L;




		if (diffInSeconds < 60) {
			// String inSeconds = Long.toString(diffInSeconds);
			return " Now ";

		} else if (diffInSeconds >= 60 && diffInSeconds <= 3599) {
			String inMnute = Long.toString(diffInMinutes);
			if (diffInMinutes <= 1) {
				return inMnute + " Minute ";
			} else {
				return inMnute + " Minutes ";
			}

		} else if (diffInSeconds >= 3600 && diffInSeconds <= 86399) {
			String inHours = Long.toString(diffInHours);
			if (diffInHours <= 1) {
				return inHours + " Hour ";
			} else {
				return inHours + " Hours ";
			}

		} else if (diffInSeconds >= 86400 && diffInSeconds <= 604799) {
			String inDays = Long.toString(diffInDays);
			if (diffInDays <= 1) {
				return inDays + " Day ";
			} else {
				return inDays + " Days ";
			}

		} else if (diffInSeconds >= 604800 && diffInSeconds <= 2627999) {
			String inWeek = Long.toString(diffInDays / weekConst);
			if (((diffInDays / weekConst)) <= 1) {
				return inWeek + " Week ";
			} else {
				return inWeek + " Weeks ";
			}
		}

		else if (diffInSeconds >= 2628000 && diffInSeconds <= 31539999) {
			String inWeek = Long.toString(diffInDays / monthConst);
			if (diffInDays / monthConst <= 1) {
				return inWeek + " Month ";
			} else {
				return inWeek + " Months ";
			}

		}

		else {
			String inYears = Long.toString(diffInDays / 365);
			if (diffInDays / 365 <= 1) {
				return inYears + " Year ";
			} else {
				return inYears + " Years ";
			}

		}

	}

	public static void main(String[] args) {

		TimeStamps Obj = new TimeStamps();
		System.out.println("result ===> " + Obj.timeDifference("12-02-2021 02:07:00"));

		System.out.println("result ===> " + Obj.timeDifference("12-02-2021 02:03:00") + " ago");
		System.out.println("result ===> " + Obj.timeDifference("12-02-2021 01:03:00") + " ago");
		System.out.println("result ===> " + Obj.timeDifference("11-02-2021 01:03:00") + " ago");
		System.out.println("result ===> " + Obj.timeDifference("01-02-2021 23:34:59") + " ago");

		System.out.println("result ===> " + Obj.timeDifference("25-01-2021 23:48:00") + " ago");

		System.out.println("result ===> " + Obj.timeDifference("15-01-2021 23:48:00") + " ago");

		System.out.println("result ===> " + Obj.timeDifference("30-12-2020 23:48:00") + " ago");

		System.out.println("result ===> " + Obj.timeDifference("11-12-2020 23:48:00") + " ago");

		System.out.println("result ===> " + Obj.timeDifference("11-07-2020 23:48:00") + " ago");

		System.out.println("result ===> " + Obj.timeDifference("11-06-2020 23:48:00") + " ago");

		System.out.println("result ===> " + Obj.timeDifference("11-05-2020 23:48:00") + " ago");

		System.out.println("result ===> " + Obj.timeDifference("11-02-2020 23:48:00") + " ago");

		System.out.println("result ===>  " + Obj.timeDifference("11-02-2019 23:48:00") + " ago");
	}

}
