package com.mycompany.aggregationapp;

import java.util.ArrayList;

/**
 *
 * @author Joat
 */
public class University {
    private ArrayList<Student>students = new ArrayList<Student>();
    private String id;
    private String name;
    private String course;
    private Double mark;
    
    public University () {
        
    }
    
    public void enrolStudent(Student s) {
        students.add(s);
    }
    
    public Student findStudentById(String searchId) {
        for(int i = 0; i < students.size(); i++) {
            Student currentStudent = students.get(i);
            if(currentStudent.getId().equals(searchId)) {
                return currentStudent;
            }
        }
        return null;
    }
    
    public ArrayList<Student> findStudentByName(String searchName) {
        for(int i = 0; i < students.size(); i++) {
            Student currentStudent = students.get(i);
            if(currentStudent.getName().equals(searchName)) {
                students.add(currentStudent);
                return students;
            }
        }
        return null;
    }
}