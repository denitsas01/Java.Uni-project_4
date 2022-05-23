package project.uni;

import project.uni.file.CloseFile;
import project.uni.file.OpenFile;

public class Menu {
    public Object menu(String menuOption) {
        if (OpenFile.isIsOpened()) {
            switch (menuOption.toLowerCase()) {
                case "open":
                    return new OpenFile();
                case "close":
                    return new CloseFile();
                case "save":
                    return new SaveFile();
                case "save as":
                    return new SaveAs();
                case "book date":
                    return new Book();
                case "unbook date":
                    return new Unbook();
                case "agenda":
                    return new Agenda();
                case "change":
                    return new Change();
                case "find":
                    return new Find();
                case "holiday":
                    return new Holiday();
                case "busy days":
                    return new BusyDays();
                case "find slot":
                    return new FindSlot();
                case "exit":
                    return new Exit();
                case "help":
                default:
                    return new Help();
            }
        } else {
            System.out.println("There is no opened file.\n");
            switch (menuOption.toLowerCase()) {
                case "open":
                    return new OpenFile();
                case "exit":
                    return new Exit();
                case "help":
                default:
                    return new Help();
            }
        }
    }
}
