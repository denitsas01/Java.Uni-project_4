package project.uni.file;

import project.uni.calendar.PersonalCalendar;

public class CloseFile {
    public void close() {
        PersonalCalendar.getCalendar().clear();
        OpenFile.setIsOpened(false);

        System.out.println("Successfully closed " +  OpenFile.getFile());
    }
}
