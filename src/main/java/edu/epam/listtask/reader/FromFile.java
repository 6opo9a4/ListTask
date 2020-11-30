package edu.epam.listtask.reader;

import edu.epam.listtask.variables.ConstantValue;
import edu.epam.listtask.variables.Student;
import edu.epam.listtask.variables.University;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FromFile {
    private static final Logger log = LogManager.getLogger(String.valueOf(Student.class));
    ConstantValue constant = new ConstantValue();

    public University readUniversityFromFile(String filename) {
        University university = new University();
        try {
            FileInputStream fi = new FileInputStream(new File(constant.getFILE_PATH()+filename + ".txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            university = (University) oi.readObject();
            oi.close();
            fi.close();
            log.info("User read from file");
        } catch (FileNotFoundException e) {
            log.error("Error: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return university;
    }

    public Student readStudentFromFile(String filename) {
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
