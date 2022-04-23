package project.uni.interfaces;

import java.util.List;

public interface Output {
    List<String> agenda(String date);
    void busyDays(String from, String to);
}
