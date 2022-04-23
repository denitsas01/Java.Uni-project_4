package project.uni.calendar.manage;

import project.uni.calendar.PersonalCalendar;
import project.uni.exception.InvalidDataException;
import project.uni.interfaces.Manage;

public class EditBook extends PersonalCalendar implements Manage {

    public EditBook(String date, String meetingName, String note, String startTime, String endTime) throws InvalidDataException {
        super(date, meetingName, note, startTime, endTime);
    }

    @Override
    public void change(String option) {

        //can edit date, startTime, endDate, name, note
    }
}
