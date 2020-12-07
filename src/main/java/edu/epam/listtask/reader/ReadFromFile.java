package edu.epam.listtask.reader;

import edu.epam.listtask.variable.Faculty;
import edu.epam.listtask.variable.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {
    private static final Logger log = LogManager.getLogger(String.valueOf(Student.class));
    public List<Student> readStudentFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader(path))) {
            while (scanner.hasNext()) {
                Student student = new Student();
                student.setId(scanner.nextLong());
                student.setName(scanner.next());
                student.setSurname(scanner.next());
                student.setPatronymic(scanner.next());
                student.setBirthday(scanner.next());
                student.setAddress(scanner.next());
                student.setTelephoneNumber(scanner.next());
                student.setFaculty(Faculty.valueOf(scanner.next()));
                student.setCurse(scanner.nextInt());
                student.setGroup(scanner.nextInt());
                students.add(student);
            }
            log.info(String.format("User read Students from file %s",path));
        } catch (FileNotFoundException e) {
            log.error(String.format("File not found %s",path));
        }
        return students;
    }
}
