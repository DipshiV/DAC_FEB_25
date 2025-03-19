//Q2. Student Marks and Grade Calculation with Exception Handling 
import java.util.*;

class Student {
    String name;
    int rollNo;
    double[] marks = new double[5];
    double average;
    char grade;

  
    Student(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;

        for (int i = 0; i < 5; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                throw new IllegalArgumentException("Marks should be between 0 and 100.");
            }
            this.marks[i] = marks[i];
        }
    }

    
    void calculateAverage() {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        average = sum / 5.0; 
    }

   
    void calculateGrade() {
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

  
    void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks:");
        for (double m : marks) {
            System.out.println("  " + m);
        }
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class Ques2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
          
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();

            double[] marks = new double[5];
            System.out.println("Enter marks for 5 subjects:");

            for (int i = 0; i < 5; i++) {
                marks[i] = sc.nextDouble();
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new IllegalArgumentException("Marks should be between 0 and 100.");
                }
            }

           
            Student s = new Student(name, rollNo, marks);
            s.calculateAverage();
            s.calculateGrade();
            s.displayStudentInfo();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numerical values for roll number and marks.");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 
    }
}