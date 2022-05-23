package project.uni.file;

import project.uni.calendar.PersonalCalendar;
import project.uni.exception.FileAlreadyOpen;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.beans.XMLDecoder;
import java.io.*;
import java.util.Map;

public class OpenFile {

    private static boolean isOpened = false;
    private static File file;

    public static File getFile() {
        return file;
    }

    public static void setFile(File file) {
        OpenFile.file = file;
    }

    public static boolean isIsOpened() {
        return isOpened;
    }

    public static void setIsOpened(boolean isOpened) {
        OpenFile.isOpened = isOpened;
    }

    public void loadFromXml(String fileName) throws JAXBException, FileNotFoundException, FileAlreadyOpen {
        if(OpenFile.isIsOpened()) {
            throw new FileAlreadyOpen();
        }
        OpenFile.setIsOpened(true);
        File myFile = new File(fileName);
        if(myFile.exists()){
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(fileName)));
            try{
                PersonalCalendar.setCalendar((Map<String,String>)decoder.readObject());
                decoder.close();
            }catch(Exception e){
                System.out.println("Eror while loading data from file " + fileName);
            }
        } else{
            new BufferedOutputStream(new FileOutputStream(fileName));
            OpenFile.setFile(myFile);
            System.out.println("A new file has been created. File name: " + fileName);
        }
        System.out.println("Successfully opened file " + fileName + "\n");
    }
}
