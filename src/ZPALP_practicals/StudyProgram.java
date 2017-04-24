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
    public int [] studentCount;
    
    public StudyProgram(String name, int courseYears){
        this.name = name;
        this.courseYears = courseYears;
        
    }
    
    public void generateStudentCount(){
        int count = (int)Math.round(Math.random()* 9  + 1);
        studentCount = new int[count];
    }
    
    public long sumStudents(){
        
        return studentCount.length * courseYears;
    }
    
    public void addCourseYear(int studentsCount){
        if(studentsCount == 6){
            System.out.println("Error, studentsCount must be lower than 6");
        }
        
    }
    
    public static void main(String[] args) {
        StudyProgram[] studyPrograms = new StudyProgram[3];
        
        
        
    }
    
    static void printCourses(StudyProgram[] array){
        for (StudyProgram studyProgram : array) {
            System.out.print("StudyProgram: " + studyProgram.name + " sumOfStudents" + studyProgram.sumStudents());
        }
    }
    
}

