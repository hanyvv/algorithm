package programmers.level1;

import java.util.Map;
import static java.util.Map.*;

public class YearOf2016 {
    private static final Map<Integer, Integer> DOOMSDAY = getDoomsday(true);
    private static final Day DOOMSDAY_WEEK = Day.MON;

    public String solution(int a, int b) {
        Integer doomsdayOfMonth = DOOMSDAY.get(a);
        int dateDif = b - doomsdayOfMonth;
        int plusDay = dateDif % 7;

        if (DOOMSDAY_WEEK.ordinal() + plusDay < 0) {
            plusDay += 7;
        }

        int index = (DOOMSDAY_WEEK.ordinal() + plusDay) % 7;

        return Day.values()[index].name();
    }

    private static Map<Integer, Integer> getDoomsday(boolean isLeapYear) {
        return isLeapYear ? makeDoomsday(4, 29) : makeDoomsday(3, 28);
    }


    public static Map<Integer, Integer> makeDoomsday(int janDay, int febDay) {
        return ofEntries(
                entry(1, janDay),
                entry(2, febDay),
                entry(3, 14),
                entry(4, 4),
                entry(5, 9),
                entry(6, 6),
                entry(7, 11),
                entry(8, 8),
                entry(9, 5),
                entry(10, 10),
                entry(11, 7),
                entry(12, 12));
    }

    enum Day {
        SUN, MON, TUE, WED, THU, FRI, SAT
    }

    public static void main(String[] args) {
        YearOf2016 year = new YearOf2016();

        String solution = year.solution(3, 1);

        System.out.println("solution = " + solution);
    }
}
