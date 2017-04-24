/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZPALP_theory;

/**
 *
 * @author Pablo
 */
public class Student {
    
    public int grade;
    public Student(int grade){
        this.grade = grade;
    }
    
    public static void swapPrimitive(int p1, int p2){
        int helpVariable = p2;
        p2 = p1;
        p1 = helpVariable;
    }
    
    public static void swapStudent(Student student1, Student student2){
        int helpVariable = student2.grade;
        student2.grade = student1.grade;
        student1.grade = helpVariable;
       
    }    
    
    public static void main(String[] args) {
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        int a = 5, b = 10;
        
        System.out.println("Student1 grade: " + student1.grade + " Student2 grade:  " + student2.grade);
        System.out.println("a = " + a + " b = "+ b);
        
        swapPrimitive(a,b); // NOT POSSIBLE
        swapStudent(student1,student2);
        
        System.out.println("Student1 grade: " + student1.grade + " Student2 grade:  " + student2.grade);
        System.out.println("a = " + a + " b = "+ b);
        
        
    }
}
