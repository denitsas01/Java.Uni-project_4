package project.uni.calendar.manage;

import project.uni.calendar.PersonalCalendar;
import project.uni.exception.InvalidDataException;

public class BookDates extends PersonalCalendar implements BookDate {

    public BookDates(String date, String meetingName, String note, String startTime, String endTime) throws InvalidDataException {
        super(date, meetingName, note, startTime, endTime);
    }

    @Override
    public void book(String date, String meetingName, String note, String startTime, String endTime) throws InvalidDataException {
        new BookDates(date, meetingName, note, startTime, endTime);
        //adds to xml file
    }

    @Override
    public void unbook(String date, String startTime, String endTime) {
        //deletes the date from the xml file
    }
}
