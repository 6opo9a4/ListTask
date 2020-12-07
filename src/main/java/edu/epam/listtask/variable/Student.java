package edu.epam.listtask.variable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Student {
    private static final Logger log = LogManager.getLogger(String.valueOf(Student.class));

    private long id;
    private String name;
    private String surname;
    private String patronymic;
    private String birthday;
    private String address;
    private String telephoneNumber;
    private Faculty faculty;
    private int curse;
    private int group;

    public Student(long id, String name, String surname, String patronymic, String birthday, String address, String telephoneNumber, Faculty faculty, int curse, int group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.faculty = faculty;
        this.curse = curse;
        this.group = group;
    }

    public Student() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
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
        code=code*(int)id;
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
        if(students.id == this.id && students.getName().equals(this.getName())&& students.getFaculty().equals(this.getFaculty())) {
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
