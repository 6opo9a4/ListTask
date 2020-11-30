package edu.epam.listtask.variables;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class University {
    private static final Logger log = LogManager.getLogger(String.valueOf(Student.class));
    ConstantValue constantValue =  new ConstantValue();
    ArrayList<Student> students;

    public University(){}
    public University(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        ArrayList<Student> students =  new ArrayList<>();
        students.addAll(this.students);
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public int hashCode() {
        int code = 1;
        for(int i=0;i<students.size();i++) {
            code = constantValue.getNUMBER_FOR_HASH_CODE() * code + students.get(i).hashCode();
        }
        code = code*students.size();
        log.info("User get HashCode");
        return code;
    }

    @Override
    public boolean equals(Object numbersArray) {
        log.info("User compare arrays");
        if (this == numbersArray){
            log.info("Arrays equals");
            return true;
        }
        if (numbersArray == null || getClass() != numbersArray.getClass()){
            log.info("Arrays different");
            return false;
        }
        University arrayOfNumbers = (University) numbersArray;
        ArrayList<Student> firstNumbers =  arrayOfNumbers.students;
        ArrayList<Student> secondNumbers = this.students;
        if(firstNumbers.size() == secondNumbers.size()){
            for (int i = 0;i<firstNumbers.size();i++){
                if(firstNumbers.get(i)!=secondNumbers.get(i)){
                    log.info("Arrays different");
                    return false;
                }
            }
            log.info("Arrays equals");
            return true;
        }
        log.info("Arrays different");
        return false;
    }



    @Override
    public String toString() {
        String forOut = String.format("Numbers(%s) - %s",students.hashCode() , students);
        log.info("User create string from Array");
        return forOut;
    }
}
