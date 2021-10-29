package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private List<String> names = new ArrayList<>();

    public boolean addStudent(String studentName) {
        if (studentName.trim().indexOf(" ") > 0) {
            names.add(studentName);
            return true;
        }
        return false;
    }

    public List<String> getNames() {
        return names;
    }
}