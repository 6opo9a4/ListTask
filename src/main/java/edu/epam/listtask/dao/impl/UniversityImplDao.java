package edu.epam.listtask.dao.impl;

import edu.epam.listtask.dao.UniversityDao;
import edu.epam.listtask.exception.DaoException;
import edu.epam.listtask.variable.Faculty;
import edu.epam.listtask.variable.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class UniversityImplDao implements UniversityDao {
    private static final Logger log = LogManager.getLogger(String.valueOf(Student.class));
    @Override
    public void addStudent(Student student, List<Student> students){
        log.info(String.format("User add student to list"));
        students.add(student);
    }

    @Override
    public void deleteStudent(int position, List<Student> students) throws DaoException {
        if(students.size() - 1 < position){
            log.error(String.format("Count of students should be more than selected position"));
            throw new DaoException("Exception: Count of students should be more than selected position");
        }
        else {
            log.info(String.format("User delete student from list"));
            students.remove(position);
        }
    }

    @Override
    public void changeStudent(int position, Student student, List<Student> students) throws DaoException{
        if(students.size() - 1 < position){
            log.error(String.format("Count of students should be more than selected position"));
            throw new DaoException("Exception: Count of students should be more than selected position");
        }
        else {
            log.info(String.format("User change student in list on position %s",position));
            students.set(position, student);
        }
    }

    @Override
    public List<Student> findStudent(int id, List<Student> students){
        List<Student> oneFacultyStudents = new ArrayList<>();
        for(int i=0;i<students.size();i++){
            Student currentStudent = students.get(i);
            if(currentStudent.getId() == id){
                oneFacultyStudents.add(currentStudent);
            }
        }
        log.info(String.format("User try found student in list by id"));
        return oneFacultyStudents;
    }

    @Override
    public List<Student> findFacultyStudents(List<Student> students, Faculty faculty){
        List<Student> oneFacultyStudents = new ArrayList<>();
        for(int i=0;i<students.size();i++){
            Student currentStudent = students.get(i);
            if(currentStudent.getFaculty() == faculty){
                oneFacultyStudents.add(currentStudent);
            }
        }
        log.info(String.format("User try found student in list by faculty"));
        return oneFacultyStudents;
    }

    @Override
    public List<Student> findFacultyStudents(List<Student> students, Faculty faculty, int curse){
        List<Student> oneFacultyStudents = new ArrayList<>();
        for(int i=0;i<students.size();i++){
            Student currentStudent = students.get(i);
            if(currentStudent.getFaculty() == faculty && currentStudent.getCurse() == curse){
                oneFacultyStudents.add(currentStudent);
            }
        }
        log.info(String.format("User try found student in list by faculty and curse"));
        return oneFacultyStudents;
    }

    @Override
    public List<Student> findBirthdayStudents(List<Student> students, String birthday){
        List<Student> oneFacultyStudents = new ArrayList<>();
        for(int i=0;i<students.size();i++){
            Student currentStudent = students.get(i);
            if(currentStudent.getBirthday().equals(birthday)){
                oneFacultyStudents.add(currentStudent);
            }
        }
        log.info(String.format("User try found student in list by birthday"));
        return oneFacultyStudents;
    }

    @Override
    public List<Student> findGroupStudents(List<Student> students, int group){
        List<Student> oneFacultyStudents = new ArrayList<>();
        for(int i=0;i<students.size();i++){
            Student currentStudent = students.get(i);
            if(currentStudent.getGroup() == group){
                oneFacultyStudents.add(currentStudent);
            }
        }
        log.info(String.format("User try to select student in group"));
        return oneFacultyStudents;
    }
}
