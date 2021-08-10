package az.pashabank.learning.session.sets;

import java.util.EnumSet;

public class EnumSetExample {

    public static void main(String[] args) {

        EnumSet<Weekday> all = EnumSet.allOf(Weekday.class);
        EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);
        EnumSet<Weekday> workday = EnumSet.range(Weekday.MONDAY, Weekday.FRIDAY);
        EnumSet<Weekday> mwf = EnumSet.of(Weekday.MONDAY, Weekday.WEDNESDAY, Weekday.FRIDAY);

        System.out.println(all); // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]
        System.out.println(never); // []
        System.out.println(mwf); // [MONDAY, WEDNESDAY, FRIDAY]

        workday.add(Weekday.SUNDAY);
        workday.remove(Weekday.TUESDAY);
        System.out.println(workday); // [MONDAY, WEDNESDAY, THURSDAY, FRIDAY, SUNDAY]
    }
}
