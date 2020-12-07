package edu.epam.listtask.dao;

import edu.epam.listtask.exception.DaoException;
import edu.epam.listtask.variable.Faculty;
import edu.epam.listtask.variable.Student;
import java.util.List;

public interface UniversityDao {
    void addStudent(Student student, List<Student> students);
    void deleteStudent(int position, List<Student> students) throws DaoException;
    void changeStudent(int position, Student student, List<Student> students) throws DaoException;
    List<Student> findStudent(int id, List<Student> students);
    List<Student> findFacultyStudents(List<Student> students, Faculty faculty);
    List<Student> findFacultyStudents(List<Student> students, Faculty faculty, int curse);
    List<Student> findBirthdayStudents(List<Student> students, String birthday);
    List<Student> findGroupStudents(List<Student> students, int group);
}
