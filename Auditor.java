//Author: Peter Adamson

public class Auditor{

	public static void main(String[] args){

	  Program sWE = new Program("SWE", 40, 8);

	  Student a = new Student(8510804, 2015);

	  System.out.println("Student " + a.getStudentID() + ":	Started in " + a.getStartYear() + ", status = " + a.audit(sWE)); 

	  a.setNumberOfCoreCourses(40);

	  System.out.println("Student " + a.getStudentID() + ":	Started in " + a.getStartYear() + ", status = " + a.audit(sWE)); 
	
    a.setNumberOfElectives(4);

    System.out.println("Student " + a.getStudentID() + ":	Started in " + a.getStartYear() + ", status = " + a.audit(sWE)); 

    a.setNumberOfElectives(4);

    System.out.println("Student " + a.getStudentID() + ":	Started in " + a.getStartYear() + ", status = " + a.audit(sWE)); 

	}


}
