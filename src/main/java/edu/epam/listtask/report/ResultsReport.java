package edu.epam.listtask.report;

import edu.epam.listtask.variable.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ResultsReport {
    private static final Logger log = LogManager.getLogger(String.valueOf(Student.class));
    public void numbersArrayOut(List<Student> someArray){
        log.info(String.format("User get result report"));
        String forOut = someArray.toString();
        System.out.println(forOut);
    }

}
