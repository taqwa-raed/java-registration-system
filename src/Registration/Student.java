/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projtaymaa;

/**
 *
 * @author PC2
 */
public class Student {
    private String fName; 
   private String lName;
   private int ID;
   private int [] examGrades = {0,0,0};
   private double finalGrade;  
   private char letterGrade; 
   static int numOfStudents = 0;
   public Student(){
       numOfStudents++;
   }
   public String getFName(){
       return fName;
   }
    public String getLName(){
       return lName;
   }
   public int getID(){
       return ID;
   }
   public int getExamGrade(int index){
       return examGrades[index];
   }
    public double getFinalGrade(){
       return finalGrade;
   }
    public char getLetterGrade(){
       return letterGrade;
   }
    public void setFName(String fName){
     this.fName = fName;  
   } 
  public void setLName(String lName){
     this.lName = lName;  
   } 
   public void setID(int ID){
     this.ID = ID;  
   }
   public void SetExamGrade(int ExamGrades ,int index){
   this.examGrades[index] =ExamGrades ;
   }
    public void CalculateFinalGrade(){
      finalGrade=  examGrades[0]*0.3 + examGrades[1]*0.3 + examGrades[2] * 0.4;
   }
    
  public void CalculateLatterGrade(){
        if(finalGrade>=90)
            letterGrade = 'A';
        else if(finalGrade>=80)
              letterGrade = 'B';
        else if(finalGrade>=70)
             letterGrade = 'C';
        else if(finalGrade>=60)
             letterGrade = 'D';
        else if(finalGrade>=50)
         letterGrade = 'E';
        else
             letterGrade = 'F';
        
            
      
   } 
}
