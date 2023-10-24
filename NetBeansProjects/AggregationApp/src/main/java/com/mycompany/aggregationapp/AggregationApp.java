package com.mycompany.aggregationapp;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Joat
 */
public class AggregationApp {

    public static void main(String[] args) {
        String name = "", course = "", mark = "";
        Scanner userInput = new Scanner (System.in);
        Scanner menuChoice = new Scanner(System.in);
        University solent  = new University();
        
        int i = 0;
        boolean stop = false;
        while(stop == false) {
            i++;
            System.out.println("1. Add a studet.");
            System.out.println("2. Search for student by ID.");
            System.out.println("3. Search for students by name.");
            System.out.println("4. Quit Application.");
            
            System.out.println("Enter your choice: ");
            int choice = menuChoice.nextInt();
            
            if(choice == 1) {
                System.out.println("Enter your name: ");
                name = userInput.nextLine();

                System.out.println("Enter your course: ");
                course = userInput.nextLine();

                System.out.println("Enter mark: ");
                mark = userInput.nextLine();
                double m = Double.parseDouble(mark);
                
                solent.enrolStudent(new Undergraduate(String.valueOf(i),  name, course, m));
                System.out.println("Student has been added!");
            }
            
            else if(choice == 2) {
                System.out.println("Enter student id: ");
                String studentId = userInput.nextLine();
                //int id = Integer.parseInt(studentId);
                Student foundStudent = solent.findStudentById(studentId);
                System.out.println(foundStudent);
            }
            
            else if(choice == 3) {
                System.out.println("Enter student name: ");
                name = userInput.nextLine();
                ArrayList<Student> studentList = solent.findStudentByName(name);
                System.out.println(studentList);
            }
            
            else if(choice == 4) {
                stop = true;
                break;
            }
            
            else {
                System.out.println("Invalid choice, try again");
                continue;
            }
        }
    }
}
