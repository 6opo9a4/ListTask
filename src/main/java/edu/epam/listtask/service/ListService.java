package edu.epam.listtask.service;

import edu.epam.listtask.dao.UniversityDao;
import edu.epam.listtask.dao.impl.UniversityImplDao;
import edu.epam.listtask.exception.DaoException;
import edu.epam.listtask.variable.Faculty;
import edu.epam.listtask.variable.Student;

import java.util.List;

public class ListService {
    private final UniversityDao universityDao = new  UniversityImplDao();

    public List<Student> findStudentsByFaculty(List<Student> students, Faculty faculty){
        List<Student> oneFacultyStudents = universityDao.findFacultyStudents(students, faculty);
        return oneFacultyStudents;
    }

    public List<Student> findStudentsByFaculty(List<Student> students, Faculty faculty, int curse){
        List<Student> oneFacultyStudents = universityDao.findFacultyStudents(students, faculty, curse);
        return oneFacultyStudents;
    }

    public List<Student> findStudentsByBirthday(List<Student> students, String birthday){
        List<Student> oneFacultyStudents = universityDao.findBirthdayStudents(students, birthday);
        return oneFacultyStudents;
    }

    public List<Student> findStudentsByGroup(List<Student> students, int group){
        List<Student> oneFacultyStudents = universityDao.findGroupStudents(students, group);
        return oneFacultyStudents;
    }

    void addStudent(Student student, List<Student> students){
        universityDao.addStudent(student,students);
    }

    void deleteStudent(int position, List<Student> students) throws DaoException {
        universityDao.deleteStudent(position,students);
    }

    void changeStudent(int position, Student student, List<Student> students) throws DaoException {
        universityDao.changeStudent(position,student,students);
    }

    public List<Student> findStudentsById(List<Student> students, int id){
        List<Student> oneFacultyStudents =  universityDao.findStudent(id,students);
        return oneFacultyStudents;
    }

}