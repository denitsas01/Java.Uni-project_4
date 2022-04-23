package project.uni.interfaces;

import project.uni.exception.InvalidDataException;

public interface BookDate {
    void book(String date, String meetingName, String note, String startTime, String endTime) throws InvalidDataException;
    void unbook(String date, String startTime, String endTime);
}
