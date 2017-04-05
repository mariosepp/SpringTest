package com.mariosepp.Dao;

import com.mariosepp.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Woozy on 5.04.2017.
 */

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Tiina", "Informaatika"));
                put(2, new Student(2, "Anna", "Matemaatika"));
                put(3, new Student(3, "Tõnu", "Matemaatika"));
            }
        };
    }

    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    public void deleteStudentById(int id) {
        this.students.remove(id);
    }

    public void updateStudent(Student student) {
        Student s = students.get(student.getId());
        if (s != null) {
            s.setCourse(student.getCourse());
            s.setName(student.getName());
        }
    }

    public void createStudent(Student student) {
        this.students.put(student.getId(), student);
    }
}
