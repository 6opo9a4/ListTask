package edu.epam.listtask.main;

import edu.epam.listtask.variables.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class LogisticMain {
    private static final Logger log = LogManager.getLogger(String.valueOf(Student.class));

    public static void main(String[] args) throws IOException {
        log.traceEntry("User start new main");

        log.traceExit("User end main");
    }
}
