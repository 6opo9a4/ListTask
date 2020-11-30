package edu.epam.listtask.dao.impl;

import edu.epam.listtask.dao.UniversityDao;
import edu.epam.listtask.exeption.DaoException;
import edu.epam.listtask.variables.Student;
import java.util.ArrayList;

public class UniversityImplDao implements UniversityDao {

    @Override
    public void addStudent(Student student, ArrayList<Student> students){
        students.add(student);
    }

    @Override
    public void dellStudent(int position, ArrayList<Student> students) throws DaoException {
        if(students.size() - 1 >= position){
            students.remove(position);
        }
        else {
            throw new DaoException("Exception: Count of students should be more than selected position");
        }
    }

    @Override
    public void changeStudent(int position, Student student, ArrayList<Student> students) throws DaoException{
        if(students.size() - 1 >= position){
            students.set(position, student);
        }
        else {
            throw new DaoException("Exception: Count of students should be more than selected position");
        }
    }

    @Override
    public ArrayList<Student> findStudent(int id, ArrayList<Student> students){
        ArrayList<Student> oneFacultyStudents = new ArrayList<>();
        for(int i=0;i<students.size();i++){
            Student currentStudent = students.get(i);
            if(currentStudent.getId() == id){
                oneFacultyStudents.add(currentStudent);
            }
        }
        return oneFacultyStudents;
    }

    @Override
    public ArrayList<Student> getFacultyStudents(ArrayList<Student> students, String faculty){
        ArrayList<Student> oneFacultyStudents = new ArrayList<>();
        for(int i=0;i<students.size();i++){
            Student currentStudent = students.get(i);
            if(currentStudent.getFaculty() == faculty){
                oneFacultyStudents.add(currentStudent);
            }
        }
        return oneFacultyStudents;
    }

    @Override
    public ArrayList<Student> getFacultyStudents(ArrayList<Student> students, String faculty,int curse){
        ArrayList<Student> oneFacultyStudents = new ArrayList<>();
        for(int i=0;i<students.size();i++){
            Student currentStudent = students.get(i);
            if(currentStudent.getFaculty() == faculty && currentStudent.getCurse() == curse){
                oneFacultyStudents.add(currentStudent);
            }
        }
        return oneFacultyStudents;
    }

    @Override
    public ArrayList<Student> getBirthdayStudents(ArrayList<Student> students, String birthday){
        ArrayList<Student> oneFacultyStudents = new ArrayList<>();
        for(int i=0;i<students.size();i++){
            Student currentStudent = students.get(i);
            if(currentStudent.getBirthday() == birthday){
                oneFacultyStudents.add(currentStudent);
            }
        }
        return oneFacultyStudents;
    }

    @Override
    public ArrayList<Student> getGroupStudents(ArrayList<Student> students, int group){
        ArrayList<Student> oneFacultyStudents = new ArrayList<>();
        for(int i=0;i<students.size();i++){
            Student currentStudent = students.get(i);
            if(currentStudent.getGroup() == group){
                oneFacultyStudents.add(currentStudent);
            }
        }
        return oneFacultyStudents;
    }
}
