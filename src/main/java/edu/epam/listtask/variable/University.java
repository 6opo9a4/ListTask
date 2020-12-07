package edu.epam.listtask.variable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class University {
    private static final Logger log = LogManager.getLogger(String.valueOf(Student.class));
    private static final int NUMBER_FOR_HASH_CODE = 17;
    private static University instance;
    private List<Student> university;

    private University() {
        this.university = new ArrayList<>();
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    public void addStudent(Student student) {
        university.add(student);
    }

    public void removeStudent(Student student) {
        university.remove(student);
    }

    public List<Student> getStudents() {
        List<Student> carList = new ArrayList<>(university);
        return carList;
    }
    @Override
    public int hashCode() {
        int code = 1;
        for(int i=0;i<university.size();i++) {
            code = NUMBER_FOR_HASH_CODE * code + university.get(i).hashCode();
        }
        code = code*university.size();
        log.info("User get HashCode");
        return code;
    }

    @Override
    public boolean equals(Object numbersArray) {
        log.info("User compare students");
        if (this == numbersArray){
            log.info("Students equals");
            return true;
        }
        if (numbersArray == null || getClass() != numbersArray.getClass()){
            log.info("Students different");
            return false;
        }
        List<Student> students = (ArrayList) numbersArray;
        if(students.size() == this.university.size()) {
            for(int i = 0; i<students.size();i++) {
                if (students.get(i).getId() == this.university.get(i).getId() && students.get(i).getName() == this.university.get(i).getName()) {
                    log.info("Arrays equals");
                    return true;
                }
            }
        }
        log.info("Arrays different");
        return false;
    }

    @Override
    public String toString() {
        String forOut = String.format("Numbers(%s) - %s",university.hashCode() , university);
        log.info("User create string from Array");
        return forOut;
    }
}
