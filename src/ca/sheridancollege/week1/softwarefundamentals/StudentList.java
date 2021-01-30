/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Natha
 */
public class StudentList {
    public static void main(String[] args) {
        //1.create an array of students
        Student[] sList = new Student[5];
        
        //2. put names in the array
        for (int i = 0; i<=sList.length-1; i++){
            sList[i] = new Student();
            sList[i].setName("Student"+(i+1));
        }
        for (Student s:sList){
            System.out.println("The student name is: "+s.getName());
        }
    }
    
}
