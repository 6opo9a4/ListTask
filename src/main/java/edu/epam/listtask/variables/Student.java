package edu.epam.listtask.variables;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Student {
    private static final Logger log = LogManager.getLogger(String.valueOf(Student.class));

    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String birthday;
    private String address;
    private String number;
    private String faculty;
    private int curse;
    private int group;

    public Student(int id, String name, String surname, String patronymic, String birthday, String address, String number, String faculty, int curse, int group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = address;
        this.number = number;
        this.faculty = faculty;
        this.curse = curse;
        this.group = group;
    }

    public Student() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCurse() {
        return curse;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public int hashCode() {
        int code = 1;
        code=code*id;
        code=code*name.length();
        code=code*surname.length();
        code=code*patronymic.length();
        return code;
    }

    @Override
    public boolean equals(Object numbersArray) {
        log.info("User compare students");
        if (this == numbersArray){
            log.info("Students equals");
            return true;
        }
        if (numbersArray == null || getClass() != numbersArray.getClass()){
            log.info("Students different");
            return false;
        }
        Student students = (Student) numbersArray;
        if(students.id == this.id && students.name == this.name && students.surname == this.surname && students.patronymic == this.patronymic && students.birthday == this.birthday) {
            log.info("Arrays equals");
            return true;
        }
        log.info("Arrays different");
        return false;
    }

    @Override
    public String toString() {
        String forOut = String.format("Student(%s) - %s,%s,%s,%s",hashCode() ,name, surname, patronymic, birthday);
        log.info("User create string from Array");
        return forOut;
    }
}
