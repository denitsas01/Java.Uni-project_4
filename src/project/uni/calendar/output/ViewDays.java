package project.uni.calendar.output;

import project.uni.calendar.PersonalCalendar;
import project.uni.exception.InvalidDataException;

import java.util.List;

public class ViewDays extends PersonalCalendar implements Output {
    public ViewDays(String date, String meetingName, String note, String startTime, String endTime) throws InvalidDataException {
        super(date, meetingName, note, startTime, endTime);
    }

    @Override
    public List<String> agenda(String date) {
        //outputs all to-dos for a specific date chronologically
        return null;
    }

    @Override
    public void busyDays(String from, String to) {
        //prints an ordered list starting from the busiest day meaning with the most booked hours
    }
}
