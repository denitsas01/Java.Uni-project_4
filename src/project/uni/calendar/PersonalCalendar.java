package project.uni.calendar;

import project.uni.exception.InvalidDataException;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Objects;

public abstract class PersonalCalendar {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private String date = sdf.format(new Date());
    private String meetingName;
    private String note;
    private String startTime;
    private String endTime;

    public PersonalCalendar(String date, String meetingName, String note, String startTime, String endTime) throws InvalidDataException {
        setDate(date);
        setMeetingName(meetingName);
        setNote(note);
        setStartTime(startTime);
        setEndTime(endTime);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) throws InvalidDataException {
        if (Objects.equals(date, " ")) {
            throw new InvalidDataException("The data field is empty!");
        } else
            this.date = date;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) throws InvalidDataException {
        if (Objects.equals(meetingName, " ")) {
            throw new InvalidDataException("The meeting name field is empty!");
        } else
            this.meetingName = meetingName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) throws InvalidDataException {
        if (Objects.equals(note, " ")) {
            throw new InvalidDataException("The note field is empty!");
        } else
            this.note = note;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        LocalTime localTime = LocalTime.parse(startTime, DateTimeFormatter.ofPattern("HH:mm"));
        int hour = localTime.get(ChronoField.CLOCK_HOUR_OF_DAY);
        int minute = localTime.get(ChronoField.MINUTE_OF_HOUR);
        this.startTime = hour +":"+ minute;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        LocalTime localTime = LocalTime.parse(endTime, DateTimeFormatter.ofPattern("HH:mm"));
        int hour = localTime.get(ChronoField.CLOCK_HOUR_OF_DAY);
        int minute = localTime.get(ChronoField.MINUTE_OF_HOUR);
        this.endTime = hour +":"+ minute;
    }

    @Override
    public String toString() {
        return "Calendar \n" +
                " date = " + date + '|' +
                " meeting name = " + meetingName + '|' +
                " note = " + note + '|' +
                " start time = " + startTime + '|' +
                " end time = " + endTime + '|';
    }
}
