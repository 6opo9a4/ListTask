package edu.epam.listtask.dao;

import edu.epam.listtask.exeption.DaoException;
import edu.epam.listtask.variables.Student;

import java.util.ArrayList;

public interface UniversityDao {
    void addStudent(Student student, ArrayList<Student> students);
    void dellStudent(int position, ArrayList<Student> students) throws DaoException;
    void changeStudent(int position, Student student, ArrayList<Student> students) throws DaoException;
    ArrayList<Student> findStudent(int id, ArrayList<Student> students);
    ArrayList<Student> getFacultyStudents(ArrayList<Student> students, String faculty);
    ArrayList<Student> getFacultyStudents(ArrayList<Student> students, String faculty,int curse);
    ArrayList<Student> getBirthdayStudents(ArrayList<Student> students, String birthday);
    ArrayList<Student> getGroupStudents(ArrayList<Student> students, int group);
}
