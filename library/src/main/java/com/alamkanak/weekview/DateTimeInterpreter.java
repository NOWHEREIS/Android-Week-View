package com.alamkanak.weekview;

import java.util.Calendar;

/**
 * Created by Raquib on 1/6/2015.
 */
public interface DateTimeInterpreter {
    public String interpretDate(Calendar date);

    String interpretTime(int hour);

    public String interpretWeek(int date);
    public String interpretTime(int hour, int minutes);
}
