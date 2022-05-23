package project.uni.exception;

public class FileAlreadyOpen extends Exception{
    public FileAlreadyOpen() {
        super("A file is already opened");
    }
}
