import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_WEEK = 604800;
    private static final int SECONDS_PER_MONTH = 2629746;
    private static final int SECONDS_PER_YEAR = 31536000;

    public static String calculateTime(int seconds) {
        List<String> timeFormats = new ArrayList<>();

        int years = seconds / SECONDS_PER_YEAR;
        if (years > 0) {
            timeFormats.add(formatTime(years, "год", "года", "лет"));
            seconds %= SECONDS_PER_YEAR;
        }

        int months = seconds / SECONDS_PER_MONTH;
        if (months > 0) {
            timeFormats.add(formatTime(months, "месяц", "месяца", "месяцев"));
            seconds %= SECONDS_PER_MONTH;
        }

        int weeks = seconds / SECONDS_PER_WEEK;
        if (weeks > 0) {
            timeFormats.add(formatTime(weeks, "неделя", "недели", "недель"));
            seconds %= SECONDS_PER_WEEK;
        }

        int days = seconds / SECONDS_PER_DAY;
        if (days > 0) {
            timeFormats.add(formatTime(days, "день", "дня", "дней"));
            seconds %= SECONDS_PER_DAY;
        }

        int hours = seconds / SECONDS_PER_HOUR;
        if (hours > 0) {
            timeFormats.add(formatTime(hours, "час", "часа", "часов"));
            seconds %= SECONDS_PER_HOUR;
        }

        int minutes = seconds / SECONDS_PER_MINUTE;
        if (minutes > 0) {
            timeFormats.add(formatTime(minutes, "минута", "минуты", "минут"));
            seconds %= SECONDS_PER_MINUTE;
        }

        if (seconds > 0) {
            timeFormats.add(formatTime(seconds, "секунда", "секунды", "секунд"));
        }

        return joinTimeFormats(timeFormats);
    }

    private static String formatTime(int quantity, String singular, String plural, String pluralMore) {
        if (quantity == 1) {
            return quantity + " " + singular;
        } else if (quantity >= 2 && quantity <= 4) {
            return quantity + " " + plural;
        } else {
            return quantity + " " + pluralMore;
        }
    }

    private static String joinTimeFormats(List<String> timeFormats) {
        int size = timeFormats.size();
        if (size == 0) {
            return "0 секунд";
        } else if (size == 1) {
            return timeFormats.get(0);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size - 1; i++) {
                sb.append(timeFormats.get(i)).append(", ");
            }
            sb.append("и ").append(timeFormats.get(size - 1));
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        int seconds1 = 62;
        System.out.println(calculateTime(seconds1));

        int seconds2 = 334512662;
        System.out.println(calculateTime(seconds2));
    }
}
