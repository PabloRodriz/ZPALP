/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZPALP_practicals;

/**
 * @author Pablo
 */

//
// --- EXCERCISE7 ----
//
public class StudyProgram {
    public String name;
    public int courseYears;
    public static int [] studentCount;
    
    public StudyProgram(String name, int courseYears){
        this.name = name;
        this.courseYears = courseYears; // max 5
        this.studentCount = new int[5]; // max 5 years
        
    }
    
    public void generateStudentCount(){
        int studentNumber;
        for (int i = 0; i < this.courseYears; i++) {
            studentNumber = (int)Math.round(Math.random()* 49  + 1);
            this.studentCount[i] = studentNumber;
        }
        
    }
    
    public static long sumStudents(){
        long totalStudents = 0;
        for (int i : studentCount) {
            totalStudents += i;
        }
        return totalStudents;
    }
    
    public void addCourseYear(int studentNumber){
        if(this.courseYears  >= 5){
            System.out.println("Error, studentsCount must be lower than 6");
            
        }else{
            this.studentCount[courseYears] = studentNumber;
            
            courseYears ++;
        }
        
    }
    
    public static void main(String[] args) {
        StudyProgram[] filologia = new StudyProgram[3];
        filologia[0] = new StudyProgram("Spanish", 3); //The course spanish has 3 years of study
        filologia[0].generateStudentCount();
        System.out.println("Suma estudiantes " + filologia[0].sumStudents());
        for (int i = 0; i <filologia[0].studentCount.length ; i++) {
            System.out.println(filologia[0].studentCount[i]);
        }
        
        filologia[1] = new StudyProgram("English", 2);
        filologia[1].generateStudentCount();
        
        filologia[2] = new StudyProgram("checo",1);
        filologia[2].generateStudentCount();
        
        
        printCourses(filologia);
        
        filologia[0].addCourseYear(50); //2016
        filologia[0].addCourseYear(20); //2017
        
        printCourses(filologia);
        
        
    }
    
    static void printCourses(StudyProgram[] array){
        for (StudyProgram studyProgram : array) {
            System.out.println("StudyProgram: " + studyProgram.name + " sumOfStudents" + studyProgram.sumStudents());
        }
    }
    
}

