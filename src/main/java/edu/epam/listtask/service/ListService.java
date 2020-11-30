package edu.epam.listtask.service;

import edu.epam.listtask.dao.UniversityDao;
import edu.epam.listtask.dao.impl.UniversityImplDao;
import edu.epam.listtask.exeption.DaoException;
import edu.epam.listtask.variables.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;


public class ListService {

    private static final Logger log = LogManager.getLogger(String.valueOf(Student.class));
    private final UniversityDao universityDao = new  UniversityImplDao();

    public ArrayList<Student> getFacultyStudents(ArrayList<Student> students, String faculty){
        ArrayList<Student> oneFacultyStudents = universityDao.getFacultyStudents(students, faculty);
        return oneFacultyStudents;
    }

    public ArrayList<Student> getFacultyStudents(ArrayList<Student> students, String faculty,int curse){
        ArrayList<Student> oneFacultyStudents = universityDao.getFacultyStudents(students, faculty, curse);
        return oneFacultyStudents;
    }

    public ArrayList<Student> getBirthdayStudents(ArrayList<Student> students, String birthday){
        ArrayList<Student> oneFacultyStudents = universityDao.getBirthdayStudents(students, birthday);
        return oneFacultyStudents;
    }

    public ArrayList<Student> getGroupStudents(ArrayList<Student> students, int group){
        ArrayList<Student> oneFacultyStudents = universityDao.getGroupStudents(students, group);
        return oneFacultyStudents;
    }

    void addStudent(Student student, ArrayList<Student> students){
        universityDao.addStudent(student,students);
    }
    void dellStudent(int position, ArrayList<Student> students) throws DaoException {
        universityDao.dellStudent(position,students);
    }
    void changeStudent(int position, Student student, ArrayList<Student> students) throws DaoException {
        universityDao.changeStudent(position,student,students);
    }

    public ArrayList<Student> getIDStudents(ArrayList<Student> students, int id){
        ArrayList<Student> oneFacultyStudents =  universityDao.findStudent(id,students);
        return oneFacultyStudents;
    }

}