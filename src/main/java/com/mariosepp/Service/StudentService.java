package com.mariosepp.Service;

import com.mariosepp.Dao.StudentDao;
import com.mariosepp.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Woozy on 5.04.2017.
 */

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }

    public void deleteStudentById(int id) {
        this.studentDao.deleteStudentById(id);
    }

    public void updateStudent(Student student) {
        this.studentDao.updateStudent(student);
    }

    public void createStudent(Student student) {
        this.studentDao.createStudent(student);
    }
}
