package kata1a;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;
    private static final int MS_PER_SECOND = 1000;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final double DAYS_PER_YEAR = 365.25;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge() {
        return toYears(new Date().getTime() - birthday.getTime());
    }

    private int toYears(long ms) {
        int a = XXX(3.0);
        return (int) (ms / MS_PER_YEAR());
    }

    private double MS_PER_YEAR() {
        return MS_PER_SECOND *
                SECONDS_PER_MINUTE * MINUTES_PER_HOUR *
                HOURS_PER_DAY * DAYS_PER_YEAR;
                
       
    }
    
    
}
