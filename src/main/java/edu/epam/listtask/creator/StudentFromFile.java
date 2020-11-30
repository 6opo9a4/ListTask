package edu.epam.listtask.creator;

import edu.epam.listtask.variables.ConstantValue;
import edu.epam.listtask.variables.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentFromFile {
    private static final Logger log = LogManager.getLogger(String.valueOf(Student.class));
    ConstantValue constant = new ConstantValue();

    public void writeToFile (String filename,String student) {
        try {
            BufferedWriter outputWriter = new BufferedWriter(new FileWriter(constant.getFILE_PATH()+filename+".txt"));
            outputWriter.write("");
            outputWriter.write(student);
            outputWriter.flush();
            outputWriter.close();
        } catch (IOException e) {
            log.error("Error: " + e.getMessage());
        }
    }

    public Student readFromFile(String filename) {
        Student student = new Student();
        try {
        FileInputStream fi = new FileInputStream(new File(constant.getFILE_PATH()+filename + ".txt"));
        ObjectInputStream oi = new ObjectInputStream(fi);
        student = (Student) oi.readObject();
        oi.close();
        fi.close();
        log.info("User read from file");
        } catch (FileNotFoundException e) {
            log.error("Error: " + e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return student;
    }
}
