package edu.epam.listtask.creator;

import edu.epam.listtask.variables.ConstantValue;
import edu.epam.listtask.variables.Student;
import edu.epam.listtask.variables.University;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UniversityFromFile {
    private static final Logger log = LogManager.getLogger(String.valueOf(Student.class));
    ConstantValue constant = new ConstantValue();

    public void writeToFile (String filename,University university) {
        try {
            FileOutputStream f = new FileOutputStream(new File(constant.getFILE_PATH()+filename+".txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(university);
            o.close();
            f.close();
        } catch (IOException e) {
            log.error("Error: " + e.getMessage());
        }
    }

    public University readFromFile(String filename) {
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
}
