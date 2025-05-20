/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A class that creates an Array of Students and populates it
 * with 5 students from the current section and then iterates over the
 * list to print each name.
 * @author dancye, Jan 2019
 */
public class StudentList {
    
    public static void main(String[] args)
    {
       Student [] studentList = new Student[0];//change size before running
       Student s1 = new Student();
       s1.setName("Ninja Turtle");
       studentList[0]=s1;
       //fill in rest 3 student names before running
       Student s2 = new Student();
       s2.setName("Farook");
       studentList[1]=s2;
       Student s3 = new Student();
       s3.setName("Julia");
       studentList[2]=s3;
       Student s4 = new Student();
       s4.setName("Sophie");
       studentList[3]=s4;
              
       for(Student s: studentList)
       {
           System.out.println(s.getName());
       }
        
    }
    
}
